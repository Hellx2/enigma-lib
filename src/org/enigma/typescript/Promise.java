package org.enigma.typescript;

public interface Promise<T> {
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise e(java.util.function.Function<T,TResult1> onfulfilled,java.util.function.Function<java.lang.Object,TResult2> onrejected);
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise e(java.util.function.Function<T,TResult1> onfulfilled);
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise e();
    @SuppressWarnings("all")
    <TResult> Promise _catch(java.util.function.Function<java.lang.Object,TResult> onrejected);
    @SuppressWarnings("all")
    <TResult> Promise _catch();
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise then(java.util.function.Function<T,TResult1> onfulfilled,java.util.function.Function<java.lang.Object,TResult2> onrejected);
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise then(java.util.function.Function<T,TResult1> onfulfilled);
    @SuppressWarnings("all")
    <TResult1, TResult2> Promise then();
}