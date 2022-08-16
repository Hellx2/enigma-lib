package org.enigma.common.err;

public class UnrequiredException extends Exception {
    public UnrequiredException(String message) {
        super(message);
    }
    public UnrequiredException(Throwable cause) {
        super(cause);
    }
    public UnrequiredException(String message,Throwable cause) {
        super(message,cause);
    }
    public UnrequiredException(Throwable cause,String message) {
        super(message,cause);
    }
    public UnrequiredException() {
        super();
    }
}