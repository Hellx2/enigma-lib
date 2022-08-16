package org.enigma.typescript;

public interface ConcatArray<T> extends java.lang.Iterable<T> {
    int length=0;
    String join(String separator);
    String join();
    T[] slice(int start,int end);
    T[] slice(int start);
    T[] slice();
}