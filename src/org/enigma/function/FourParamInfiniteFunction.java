package org.enigma.function;

@SuppressWarnings("unchecked")
public interface FourParamInfiniteFunction<T,U,V,W,X,R> {
    R apply(T t,U u,V v,W w,X... x);
}