package org.enigma.typescript;

import org.enigma.function.*;

public interface Float32Array {
    public int BYTES_PER_ELEMENT=0;
    public ArrayBuffer buffer=null;
    public int byteLength=0;
    public int byteOffset=0;
    public Float32Array copyWithin(int target,int start,int end);
    public Float32Array copyWithin(int target,int start);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean every(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate);
    public Float32Array fill(float value,int start,int end);
    public Float32Array fill(float value,int start);
    public Float32Array fill(float value);
    public Float32Array filter(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public Float32Array filter(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate);
    public float find(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public float find(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Boolean> predicate);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Boolean> predicate,java.lang.Object thisArg);
    public int findIndex(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Boolean> predicate);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Void> callbackfn,java.lang.Object thisArg);
    public void forEach(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Void> callbackfn);
    public int indexOf(float searchElement,int fromIndex);
    public int indexOf(float searchElement);
    public java.lang.String join(java.lang.String separator);
    public java.lang.String join();
    public int lastIndexOf(float searchElement,int fromIndex);
    public int lastIndexOf(float searchElement);
    public int length=0;
    public Float32Array map(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn,java.lang.Object thisArg);
    public Float32Array map(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn);
    public int reduce(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn,int initialValue);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn);
    public int reduceRight(QuadFunction<java.lang.Number,java.lang.Number,java.lang.Number,Float32Array,java.lang.Number> callbackfn,int initialValue);
    public Float32Array reverse();
    public void set(ArrayLike<java.lang.Number> array,int offset);
    public void set(ArrayLike<java.lang.Number> array);
    public Float32Array slice(int start,int end);
    public Float32Array slice(int start);
    public Float32Array slice();
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate,java.lang.Object thisArg);
    public boolean some(TripleFunction<java.lang.Number,java.lang.Number,Float32Array,java.lang.Object> predicate);
    public Float32Array sort(java.util.function.BiFunction<java.lang.Number,java.lang.Number,java.lang.Number> compareFn);
    public Float32Array subarray(int begin,int end);
    public Float32Array subarray(int begin);
    public Float32Array subarray();
    public java.lang.String toLocaleString();
    public java.lang.String toString();
    public Float32Array valueOf();
}