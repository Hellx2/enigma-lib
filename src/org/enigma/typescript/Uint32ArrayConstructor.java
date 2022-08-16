package org.enigma.typescript;

public interface Uint32ArrayConstructor {
    public Uint32Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Uint32Array of(int... items);
    public Uint32Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Uint32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Uint32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}