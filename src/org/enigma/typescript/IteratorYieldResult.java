package org.enigma.typescript;

public interface IteratorYieldResult<TYeild> {
    boolean done=false;
    /**Converted to function due to compatibility issues. */
    TYeild value();
}