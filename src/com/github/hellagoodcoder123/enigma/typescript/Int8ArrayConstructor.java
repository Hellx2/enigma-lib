package com.github.hellagoodcoder123.enigma.typescript;

public interface Int8ArrayConstructor {
    public Int8Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Int8Array of(byte... items);
    public Int8Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Int8Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Int8Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}