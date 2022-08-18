package com.github.hellagoodcoder123.enigma.common.numeric;

public class Utility {
    public static int[] range(int end){
        int[] a=new int[end];
        for(int i=0;i<end;i++){
            a[i]=i;
        }
        return a;
    }
    public static int[] range(int start,int end){
        int[] a=new int[end-start];
        for(int i=start;i<end;i++){
            a[i-start]=i;
        }
        return a;
    }
}