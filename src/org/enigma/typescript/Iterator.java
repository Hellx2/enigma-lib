package org.enigma.typescript;

public interface Iterator<T,TReturn> {
    IteratorResult<T, TReturn> next(java.lang.Object... args);
    IteratorResult<T, TReturn> _return(TReturn value);
    IteratorResult<T, TReturn> _return();
    IteratorResult<T, TReturn> _throw(Throwable e);
    IteratorResult<T, TReturn> _throw();
}