package org.enigma.typescript;

import org.enigma.function.QuadFunction;
import org.enigma.function.TripleFunction;

public interface Array<T> extends RelativeIndexable<T> {
    public int length=0;
    public String toLocaleString();
    public T pop();
    @SuppressWarnings("unchecked")
    public int push(T... items);
    @SuppressWarnings("unchecked")
    public T[] concat(ConcatArray<T>... items);
    @SuppressWarnings("unchecked")
    public T[] concat(T... items);
    public String join(char separator);
    public String join();
    public T[] reverse();
    public T shift();
    public T[] slice(int start,int end);
    public T[] slice(int start);
    public T[] slice();
    public Array<T> sort(java.util.function.Function<T,Number> compareFn);
    public Array<T> sort();
    @SuppressWarnings("unchecked")
    public T[] splice(int start,int deleteCount,T... items);
    public T[] splice(int start,int deleteCount);
    public T[] splice(int start);
    @SuppressWarnings("unchecked")
    public int unshift(T... items);
    public int indexOf(T searchElement,int fromIndex);
    public int indexOf(T searchElement);
    public int lastIndexOf(T searchElement,int fromIndex);
    public int lastIndexOf(T searchElement);
    <S extends T> boolean every(TripleFunction<T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
    <S extends T> boolean every(TripleFunction<T,Number,T[],Boolean> predicate);
    public boolean some(TripleFunction<T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
    public boolean some(TripleFunction<T,Number,T[],Boolean> predicate);
    public boolean forEach(TripleFunction<T,Number,T[],Void> predicate,java.lang.Object thisArg);
    public boolean forEach(TripleFunction<T,Number,T[],Void> callbackfn);
    public <U> U[] map(TripleFunction<T,Number,T[],U> predicate,java.lang.Object thisArg);
    public <U> U[] map(TripleFunction<T,Number,T[],U> callbackfn);
    public <S extends T> S[] filter(TripleFunction<T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
    public <S extends T> S[] filter(TripleFunction<T,Number,T[],Boolean> predicate);
    public T reduce(QuadFunction<T,T,Number,T[],T> callbackfn);
    public T reduce(QuadFunction<T,T,Number,T[],T> callbackfn,T initialValue);
    public T reduceRight(QuadFunction<T,T,Number,T[],T> callbackfn);
    public T reduceRight(QuadFunction<T,T,Number,T[],T> callbackfn,T initialValue);
    public boolean isArray(java.lang.Object arg);
    public <U,This> U[] flatMap(QuadFunction<This,T,Number,T[],U> callback,This thisArg);
    public <U,This> U[] flatMap(QuadFunction<This,T,Number,T[],U> callback);
    public <U,This> U[] flatMap(ReadonlyArray<U> callback,This thisArg);
    public <U,This> U[] flatMap(ReadonlyArray<U> callback);
    public <A,D extends Number> FlatArray<A,D>[] flat(A _this,D depth);
    public <A,D extends Number> FlatArray<A,D>[] flat(A _this);
    public boolean includes(T searchElement,int fromIndex);
    public boolean includes(T searchElement);
    public IterableIterator<Number, T> entries();
    public IterableIterator<Number> keys();
    public IterableIterator<T> values();
    public <S extends T> S find(QuadFunction<Void,T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
    public <S extends T> S find(QuadFunction<Void,T,Number,T[],Boolean> predicate);
    public T find(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
    public T find(TripleFunction<T,Number,T[],Object> predicate);
    public T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
    public T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate);
    public Array<T> fill(T value,int start,int end);
    public Array<T> fill(T value,int start);
    public Array<T> fill(T value);
    public Array<T> copyWithin(int target,int start,int end);
    public Array<T> copyWithin(int target,int start);
}