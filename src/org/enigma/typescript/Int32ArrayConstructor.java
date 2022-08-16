package org.enigma.typescript;

public interface Int32ArrayConstructor {
    public Int32Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Int32Array of(int... items);
    public Int32Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Int32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Int32Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}