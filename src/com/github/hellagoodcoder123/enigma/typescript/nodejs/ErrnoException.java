package com.github.hellagoodcoder123.enigma.typescript.nodejs;

public interface ErrnoException extends org.enigma.typescript.Error {
    int errno=0;
    java.lang.String code=null;
    java.lang.String path=null;
    java.lang.String syscall=null;
}