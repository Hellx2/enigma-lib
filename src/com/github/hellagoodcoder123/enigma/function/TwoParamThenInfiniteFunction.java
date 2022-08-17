package com.github.hellagoodcoder123.enigma.function;

public interface TwoParamThenInfiniteFunction<T,U,V,R> {
    @SuppressWarnings("unchecked")
    R apply(T t,U u,V... v);
}