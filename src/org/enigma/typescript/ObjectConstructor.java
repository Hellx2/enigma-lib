package org.enigma.typescript;

public interface ObjectConstructor {
    Object createObject(java.lang.Object value);
    Object prototype=null;
    java.lang.Object getPrototypeOf(java.lang.Object o);
    PropertyDescriptor getOwnPropertyDescriptor(java.lang.Object o,java.lang.String p);
    PropertyDescriptor getOwnPropertyDescriptor(java.lang.Object o,int p);
    PropertyDescriptor getOwnPropertyDescriptor(java.lang.Object o,float p);
    PropertyDescriptor getOwnPropertyDescriptor(java.lang.Object o,double p);
    PropertyDescriptor getOwnPropertyDescriptor(java.lang.Object o,char p);
    java.lang.String[] getOwnPropertyNames(java.lang.Object o);
    java.lang.Object create(java.lang.Object o,Object$create$properties properties);
    <T> T defineProperty(T o,java.lang.String p,Object$defineProperty$attributes attributes);
    <T> T defineProperty(T o,int p,Object$defineProperty$attributes attributes);
    <T> T defineProperty(T o,char p,Object$defineProperty$attributes attributes);
    <T> T defineProperties(T o,Object$create$properties properties);
    <T> T seal(T o);
    <T> T[] freeze(T[] a);
    <T extends Function> T freeze(T a);
    <T> T freeze(T o);
    <T> T preventExtension(T o);
    boolean isSealed(java.lang.Object o);
    boolean isFrozen(java.lang.Object o);
    boolean isExtensible(java.lang.Object o);
    java.lang.String[] keys(java.lang.Object o);
}