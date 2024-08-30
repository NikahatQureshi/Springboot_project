package net.javaguides.springboot_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoucreNotFoundException extends RuntimeException {

    public ResoucreNotFoundException( String message){
        super(message);
    }
}
