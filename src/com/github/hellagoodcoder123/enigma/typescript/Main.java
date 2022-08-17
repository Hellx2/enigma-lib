package com.github.hellagoodcoder123.enigma.typescript;

public class Main {
    public static int parseInt(java.lang.String x){
        return Integer.parseInt(x);
    }
    /**{@code x} floored. */
    public static int parseInt(double x){
        return parseInt(String.valueOf(x).split(String.valueOf('.'))[0]);
    }
    /**{@code x} floored. */
    public static int parseInt(float x){
        return parseInt(String.valueOf(x).split(java.lang.String.valueOf('.'))[0]);
    }
    public static int parseInt(long x){
        return x<2147483647L?parseInt(String.valueOf(x)):2147483647;
    }
    public static int parseInt(short x){
        return x;
    }
    public static int parseInt(byte x){
        return x;
    }
    public static float parseFloat(java.lang.String x){
        return Float.parseFloat(x);
    }
    public static float parseFloat(double x){
        return parseFloat(String.valueOf(x));
    }
    public static float parseFloat(int x){
        return x>Float.MAX_VALUE?Float.MAX_VALUE:(x<Float.MIN_VALUE?Float.MIN_VALUE:x);
    }
    public static float parseFloat(short x){
        return parseFloat(parseInt(x));
    }
    public static float parseFloat(long x){
        return parseFloat(parseInt(x));
    }
    public static float parseFloat(byte x){
        return parseFloat(parseInt(x));
    }
    public static double RadToDeg(double rad){
        return rad*180/java.lang.Math.PI;
    }
    public static double DegToRad(double deg){
        return deg*java.lang.Math.PI/180;
    }
    public static double GradToRad(double grad){
        return grad*java.lang.Math.PI/200;
    }
    public static double RadToGrad(double rad){
        return rad*200/java.lang.Math.PI;
    }
}