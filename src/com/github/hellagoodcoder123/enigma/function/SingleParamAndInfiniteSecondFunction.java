package com.github.hellagoodcoder123.enigma.function;

public interface SingleParamAndInfiniteSecondFunction<T,U,R> {
    @SuppressWarnings("unchecked")
    R apply(T t,U... u);
}