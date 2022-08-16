package org.enigma.typescript;

public interface IteratorReturnResult<TReturn> {
    boolean done=true;
    /**Converted to function due to compatibility issues. */
    TReturn value();
}