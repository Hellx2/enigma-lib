package org.enigma.typescript;

public interface Object {
    Function constructor=null;
    java.lang.String toString();
    java.lang.String toLocaleString();
    Object valueOf();
    boolean hasOwnProperty(PropertyKey v);
    boolean isPrototypeOf(Object v);
    boolean propertyIsEnumerable(PropertyKey v);
}