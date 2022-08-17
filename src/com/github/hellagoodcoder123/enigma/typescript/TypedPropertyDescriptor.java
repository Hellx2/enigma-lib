package com.github.hellagoodcoder123.enigma.typescript;

public interface TypedPropertyDescriptor<T> {
    boolean enumerable=false;
    boolean configurable=false;
    boolean writable=false;
    /**Function port. See NOTES. */
    T value();
    T get();
    void set(T value);
}