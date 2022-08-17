package com.github.hellagoodcoder123.enigma.typescript;

public interface PropertyDescriptor {
    boolean configurable=false;
    boolean enumerable=false;
    java.lang.Object value=null;
    boolean writable=false;
    java.lang.Object get();
    void set(java.lang.Object v);
}