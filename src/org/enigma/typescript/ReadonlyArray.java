package org.enigma.typescript;

import org.enigma.function.QuadFunction;
import org.enigma.function.TripleFunction;

@SuppressWarnings("unchecked")
public interface ReadonlyArray<T> {
    <S extends T> S find(QuadFunction<Void,T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
    <S extends T> S find(QuadFunction<Void,T,Number,T[],Boolean> predicate);
    T find(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
    T find(TripleFunction<T,Number,T[],java.lang.Object> predicate);
    T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
    T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate);
    int length=0;
    java.lang.String toLocaleString();
    T[] concat(ConcatArray<T>... items);
    T[] concat(T... items);
    java.lang.String join(java.lang.String separator);
    java.lang.String join();
    T[] slice(int start,int end);
    T[] slice(int start);
    T[] slice();
    int indexOf(T searchElement,int fromIndex);
    int indexOf(T searchElement);
    int lastIndexOf(T searchElement,int fromIndex);
    int lastIndexOf(T searchElement);
    <S extends T> boolean every(TripleFunction<T,java.lang.Number,T[],java.lang.Boolean> predicate,java.lang.Object thisArg);
    <S extends T> boolean every(TripleFunction<T,java.lang.Number,T[],java.lang.Boolean> predicate);
    boolean some(TripleFunction<T,java.lang.Number,T[],java.lang.Boolean> predicate,java.lang.Object thisArg);
    boolean some(TripleFunction<T,java.lang.Number,T[],java.lang.Boolean> predicate);
    void forEach(TripleFunction<T,java.lang.Number,T[],Void> callbackfn,java.lang.Object thisArg);
    void forEach(TripleFunction<T,java.lang.Number,T[],Void> callbackfn);
    <U> U[] map(TripleFunction<T,java.lang.Number,T[],U> callbackfn,java.lang.Object thisArg);
    <U> U[] map(TripleFunction<T,java.lang.Number,T[],U> callbackfn);
    <S extends T> S[] filter(TripleFunction<T,java.lang.Number,T[],Boolean> callbackfn,java.lang.Object thisArg);
    <S extends T> S[] filter(TripleFunction<T,java.lang.Number,T[],Boolean> callbackfn);
    T reduce(QuadFunction<T,T,java.lang.Number,T[],T> callbackfn);
    T reduce(QuadFunction<T,T,java.lang.Number,T[],T> callbackfn,T initialValue);
    T reduceRight(QuadFunction<T,T,java.lang.Number,T[],T> callbackfn);
    T reduceRight(QuadFunction<T,T,java.lang.Number,T[],T> callbackfn,T initialValue);
}
