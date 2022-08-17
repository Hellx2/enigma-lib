package com.github.hellagoodcoder123.enigma.common.numeric;

public class Randomizer {
    public static int ranint(int start,int end) throws NumberOutOfRangeException {
        if(end<start)throw new NumberOutOfRangeException();
        if(end==start)return end;
        return (int)Math.floor(Math.random()*((end+1)-start))+start;
    }
    public static int ranint(int end) throws NumberOutOfRangeException {
        return ranint(0,end);
    }
    public static double ran(double min,double max) throws NumberOutOfRangeException {
        if(max<min)throw new NumberOutOfRangeException();
        if(max==min)return max;
        return (Math.random()*(max-min))+min;
    }
    public static double ran(double max) throws NumberOutOfRangeException {
        return ran(0,max);
    }
    public static Object randomItem(Object[] array) throws NumberOutOfRangeException {
        return array[ranint(0,array.length)];
    }
}