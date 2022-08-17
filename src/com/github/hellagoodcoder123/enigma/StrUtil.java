package com.github.hellagoodcoder123.enigma;

public class StrUtil {
    String concat(String... strings){
        String a="";
        for(String string:strings){
            a+=string;
        }
        return a;
    }
    String concat(char... chars){
        String a="";
        for(char c:chars){
            a+=c;
        }
        return a;
    }
    String valueOf(Object[] array){
        return array.toString();
    }
    String valueOf(int[] array){
        return array.toString();
    }
    String valueOf(double[] array){
        return array.toString();
    }
    String valueOf(short[] array){
        return array.toString();
    }
    String valueOf(long[] array){
        return array.toString();
    }
    String valueOf(float[] array){
        return array.toString();
    }
    String valueOf(char[] array){
        return array.toString();
    }
    String valueOf(boolean[] array){
        return array.toString();
    }
    String valueOf(byte[] array){
        return array.toString();
    }
}