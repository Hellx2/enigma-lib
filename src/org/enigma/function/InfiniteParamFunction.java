package org.enigma.function;

public interface InfiniteParamFunction<A,R> {
    @SuppressWarnings("unchecked")
    R apply(A... args);
}