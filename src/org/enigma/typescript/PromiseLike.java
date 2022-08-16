package org.enigma.typescript;

public interface PromiseLike<T> {
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike e(java.util.function.Function<T,TResult1> onfulfilled,java.util.function.Function<java.lang.Object,TResult2> onrejected);
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike e(java.util.function.Function<T,TResult1> onfulfilled);
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike e();
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike then(java.util.function.Function<T,TResult1> onfulfilled,java.util.function.Function<java.lang.Object,TResult2> onrejected);
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike then(java.util.function.Function<T,TResult1> onfulfilled);
    @SuppressWarnings("all")
    <TResult1, TResult2> PromiseLike then();
}