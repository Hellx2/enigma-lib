package com.github.hellagoodcoder123.enigma.function;

@SuppressWarnings("unchecked")
public interface FiveParamInfiniteFunction<T,U,V,W,X,Y,R> {
    R apply(T t,U u,V v,W w,X x,Y... y);
}