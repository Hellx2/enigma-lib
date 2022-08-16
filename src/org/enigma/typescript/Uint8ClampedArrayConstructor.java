package org.enigma.typescript;

public interface Uint8ClampedArrayConstructor {
    public Uint8ClampedArray prototype=null;
    public int BYTES_PER_ELEMENT=0;
    public Uint8ClampedArray of(short... items);
    public Uint8ClampedArray from(ArrayLike<java.lang.Number> arrayLike);
    public <T> Uint8ClampedArray from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn,java.lang.Object thisArg);
    public <T> Uint8ClampedArray from(ArrayLike<T> arrayLike,java.util.function.BiFunction<T,java.lang.Number,java.lang.Number> mapfn);
}