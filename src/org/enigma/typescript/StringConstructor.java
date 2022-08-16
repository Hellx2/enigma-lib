package org.enigma.typescript;

public interface StringConstructor {
    String propotype=null;
    String fromCharCode(int... codes);
    default java.lang.String valueOf(int x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(double x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(long x){
        return java.lang.String.valueOf(x);
    }
    default  java.lang.String valueOf(float x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(short x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(byte x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(char x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String valueOf(boolean x){
        return x?"true":"false";
    }
    default java.lang.String valueOf(java.lang.Object x){
        return java.lang.String.valueOf(x);
    }
    default java.lang.String parseString(java.lang.Object x){
        return valueOf(x);
    }
    default java.lang.String parseString(int x){
        return valueOf(x);
    }
    default java.lang.String parseString(double x){
        return valueOf(x);
    }
    default java.lang.String parseString(float x){
        return valueOf(x);
    }
    default java.lang.String parseString(long x){
        return valueOf(x);
    }
    default java.lang.String parseString(short x){
        return valueOf(x);
    }
    default java.lang.String parseString(byte x){
        return valueOf(x);
    }
    default java.lang.String parseString(char x){
        return valueOf(x);
    }
    default java.lang.String parseString(boolean x){
        return valueOf(x);
    }
}