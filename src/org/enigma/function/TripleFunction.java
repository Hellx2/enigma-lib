package org.enigma.function;

public interface TripleFunction<T,U,V,R> {
    R apply(T t,U u,V v);
}