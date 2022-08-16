package org.enigma.typescript;

import org.enigma.function.*;

public interface Uint8ClampedArray {
    public int BYTES_PER_ELEMENT=0;
    public ArrayBuffer buffer=null;
    public int byteLength=0;
    public int byteOffset=0;
    public Uint8ClampedArray copyWithin(int target,int start,int end);
    public Uint8ClampedArray copyWithin(int target,int start);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate);
    public Uint8ClampedArray fill(byte value,int start,int end);
    public Uint8ClampedArray fill(byte value,int start);
    public Uint8ClampedArray fill(byte value);
    public Uint8ClampedArray filter(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate,java.lang.Object thisArg);
    public Uint8ClampedArray filter(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate);
    public short find(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public short find(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Boolean> predicate);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Boolean> predicate);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Void> callbackfn,java.lang.Object thisArg);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Void> callbackfn);
    public int indexOf(short searchElement,int fromIndex);
    public int indexOf(short searchElement);
    public java.lang.String join(java.lang.String separator);
    public java.lang.String join();
    public int lastIndexOf(short searchElement,int fromIndex);
    public int lastIndexOf(short searchElement);
    public int length=0;
    public Uint8ClampedArray map(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn,java.lang.Object thisArg);
    public Uint8ClampedArray map(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn,int initialValue);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Number> callbackfn,int initialValue);
    public Uint8ClampedArray reverse();
    public void set(ArrayLike<java.lang.Number> array,int offset);
    public void set(ArrayLike<java.lang.Number> array);
    public Uint8ClampedArray slice(int start,int end);
    public Uint8ClampedArray slice(int start);
    public Uint8ClampedArray slice();
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Uint8ClampedArray,java.lang.Object> predicate);
    public Uint8ClampedArray sort(java.util.function.BiFunction<java.lang.Number,java.lang.Number,java.lang.Number> compareFn);
    public Uint8ClampedArray subarray(int begin,int end);
    public Uint8ClampedArray subarray(int begin);
    public Uint8ClampedArray subarray();
    public java.lang.String toLocaleString();
    public java.lang.String toString();
    public Uint8ClampedArray valueOf();
}