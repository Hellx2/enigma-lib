package com.github.hellagoodcoder123.enigma.typescript;

public interface ArrayConstructor {
    public default boolean isArray(java.lang.Object arg){
        return arg instanceof java.lang.Object[];
    }
    public java.lang.Object[] prototype=null;
}