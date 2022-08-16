package org.enigma.typescript;

public interface Int16ArrayConstructor {
    public Int16Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Int16Array of(short... items);
    public Int16Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Int16Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Int16Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}