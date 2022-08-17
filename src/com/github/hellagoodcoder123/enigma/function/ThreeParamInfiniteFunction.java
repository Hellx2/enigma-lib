package com.github.hellagoodcoder123.enigma.function;

@SuppressWarnings("unchecked")
public interface ThreeParamInfiniteFunction<T,U,V,W,R> {
    R apply(T t,U u,V v,W... w);
}