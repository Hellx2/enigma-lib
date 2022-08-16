package org.enigma.typescript;

public interface Float64ArrayConstructor {
    public Float64Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Float64Array of(double... items);
    public Float64Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Float64Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Float64Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}