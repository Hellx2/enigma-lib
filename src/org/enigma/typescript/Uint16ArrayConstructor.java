package org.enigma.typescript;

public interface Uint16ArrayConstructor {
    public Uint16Array prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Uint16Array of(short... items);
    public Uint16Array from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Uint16Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Uint16Array from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}