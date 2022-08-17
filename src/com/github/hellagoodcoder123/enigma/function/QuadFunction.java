package com.github.hellagoodcoder123.enigma.function;

public interface QuadFunction<T,U,V,W,R> {
    R apply(T t,U u,V v,W w);
}