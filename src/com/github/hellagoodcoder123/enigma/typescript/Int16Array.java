package com.github.hellagoodcoder123.enigma.typescript;

import org.enigma.function.*;

public interface Int16Array {
    public int BYTES_PER_ELEMENT=0;
    public ArrayBuffer buffer=null;
    public int byteLength=0;
    public int byteOffset=0;
    public Int16Array copyWithin(int target,int start,int end);
    public Int16Array copyWithin(int target,int start);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate);
    public Int16Array fill(short value,int start,int end);
    public Int16Array fill(short value,int start);
    public Int16Array fill(short value);
    public Int16Array filter(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public Int16Array filter(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate);
    public short find(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public short find(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Boolean> predicate);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Boolean> predicate);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Void> callbackfn,java.lang.Object thisArg);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Void> callbackfn);
    public int indexOf(short searchElement,int fromIndex);
    public int indexOf(short searchElement);
    public java.lang.String join(java.lang.String separator);
    public java.lang.String join();
    public int lastIndexOf(short searchElement,int fromIndex);
    public int lastIndexOf(short searchElement);
    public int length=0;
    public Int16Array map(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn,java.lang.Object thisArg);
    public Int16Array map(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn,int initialValue);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Int16Array,java.lang.Number> callbackfn,int initialValue);
    public Int16Array reverse();
    public void set(ArrayLike<java.lang.Number> array,int offset);
    public void set(ArrayLike<java.lang.Number> array);
    public Int16Array slice(int start,int end);
    public Int16Array slice(int start);
    public Int16Array slice();
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Int16Array,java.lang.Object> predicate);
    public Int16Array sort(java.util.function.BiFunction<java.lang.Number,java.lang.Number,java.lang.Number> compareFn);
    public Int16Array subarray(int begin,int end);
    public Int16Array subarray(int begin);
    public Int16Array subarray();
    public java.lang.String toLocaleString();
    public java.lang.String toString();
    public Int16Array valueOf();
}