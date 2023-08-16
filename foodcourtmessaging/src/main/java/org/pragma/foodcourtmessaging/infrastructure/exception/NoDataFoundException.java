package org.pragma.foodcourtmessaging.infrastructure.exception;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException() {
        super(ExceptionConstant.RESTAURANT_NO_DATA);
    }
}
