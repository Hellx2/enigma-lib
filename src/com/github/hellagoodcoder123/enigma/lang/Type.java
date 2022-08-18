package com.github.hellagoodcoder123.enigma.lang;

public class Type {
    public String name;
    public Object[] accepts;
    public static Type object;
    public static Type string;
    public static Type int8;
    public static Type int16;
    public static class or<A extends Type,B extends Type> extends Type {
        String name=null;
        Object[] accepts={1,0};
    }
    public static boolean or(boolean a,boolean b){
        return a||b;
    }
    public static boolean and(boolean a,boolean b){
        return a&&b;
    }
}