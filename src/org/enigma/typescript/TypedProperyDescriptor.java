package org.enigma.typescript;

public interface TypedProperyDescriptor<T> {
    boolean enumerable=false;
    boolean configurable=false;
    boolean writable=false;
    /**Function port. See NOTES. */
    T value();
    T get();
    void set(T value);
}