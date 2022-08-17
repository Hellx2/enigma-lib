package com.github.hellagoodcoder123.enigma.typescript;

public interface Uint8ArrayConstructor {
    public Uint8Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Uint8Array of(short... items);
    public Uint8Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Uint8Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Uint8Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}