package com.github.hellagoodcoder123.enigma;

public class ArrayUtils {
    @SuppressWarnings("unchecked")
    public static <T> T[] merge(T[] a,T[] b){
        Object[] c=new Object[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i<a.length+b.length;i++){
            c[i]=b[i-a.length];
        }
        return (T[])c;
    }
    public static char[] push(char[] a,char... items){
        int b=a.length;
        for(char item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static int[] push(int[] a,int... items){
        int b=a.length;
        for(int item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static byte[] push(byte[] a,byte... items){
        int b=a.length;
        for(byte item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static Object[] push(Object[] a,Object... items){
        int b=a.length;
        for(Object item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static String[] push(String[] a,String... items){
        int b=a.length;
        for(String item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static long[] push(long[] a,long... items){
        int b=a.length;
        for(long item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static short[] push(short[] a,short... items){
        int b=a.length;
        for(short item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    public static boolean[] push(boolean[] a,boolean... items){
        int b=a.length;
        for(boolean item:items){
            a[b]=item;
            ++b;
        }
        return a;
    }
    @SuppressWarnings("unchecked")
    public static <T> T[] of(T... items){
        Object[] a={};
        for(T item : items){
            push(a,item);
        }
        return (T[])a;
    }
    public static Object pop(Object[] a){
        Object b=a[a.length-1];
        a[a.length-1]=null;
        return b;
    }
}