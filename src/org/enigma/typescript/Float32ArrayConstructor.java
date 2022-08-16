package org.enigma.typescript;

public interface Float32ArrayConstructor {
    public Float32Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Float32Array of(float... items);
    public Float32Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Float32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Float32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}