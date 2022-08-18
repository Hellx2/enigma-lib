package com.github.hellagoodcoder123.enigma.common;

import java.util.Map;
import com.github.hellagoodcoder123.enigma.function.*;

@SuppressWarnings("all")
public class Types {
    private Types(){}
    public static Type number=new Type(double.class,float.class,int.class,short.class,byte.class,Double.class,Integer.class,Byte.class,Short.class,Float.class);
    public static Type string=new Type(String.class,char.class);
    public static Type object=new Type(Object.class);
    public static Type function=new Type(java.util.function.Function.class,java.util.function.BiFunction.class,InfiniteParamFunction.class,TwoParamThenInfiniteFunction.class,ThreeParamInfiniteFunction.class,FourParamInfiniteFunction.class,FiveParamInfiniteFunction.class,TripleFunction.class,QuadFunction.class,QuintFunction.class,SextupleFunction.class,SeptupleFunction.class,ParamlessFunction.class);
    public static Type undefined=new Type(null,0,"",0d,0f,0L,0/0);
    public static Type bigint=new Type(Long.class,long.class);
    public static Type bool=new Type(true,false);
    public static Type any=new Type(object,bool,string,number,bigint,undefined);
    public static Type float32=new Type(float.class);
    public static Type float64=new Type(double.class);
    public static Type int1=new Type(-1,0,1);
    public static Type int2=new Type(-4,-3,-2,-1,0,1,2,3);
    public static Type int4=new Type(-16,-15,-14,-13,-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
    public static Type int8=new Type(byte.class);
    public static Type int16=new Type(short.class);
    public static Type int32=new Type(int.class);
    public static Type int64=new Type(long.class);
    public static Type str=new Type(string);
    public static Type num=new Type(number,bigint);
    public static Type Any=new Type(any);
    public static Type binary=new Type(0,1);
}