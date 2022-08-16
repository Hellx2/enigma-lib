package org.enigma.common.numeric;

public class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(){
        super();
    }
    public NumberOutOfRangeException(String message){
        super(message);
    }
    public NumberOutOfRangeException(Throwable cause){
        super(cause);
    }
    public NumberOutOfRangeException(Throwable cause,String message){
        super(message,cause);
    }
    public NumberOutOfRangeException(String message,Throwable cause){
        super(message,cause);
    }
}