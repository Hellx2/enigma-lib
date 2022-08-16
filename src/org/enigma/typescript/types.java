package org.enigma.typescript;

import org.enigma.function.*;

public class types {
    public static type string=new type(java.lang.String.class,char.class);
    public static type any=new type(java.lang.Object.class);
    public static type object=new type(java.lang.Object.class);
    public static type number=new type(java.lang.Number.class,int.class,float.class,double.class,short.class,byte.class);
    public static type symbol=new type(char.class);
    public static type unknown=new type(java.lang.Object.class);
    public static type function=new type(SingleParamAndInfiniteSecondFunction.class,TwoParamThenInfiniteFunction.class,ThreeParamInfiniteFunction.class,FourParamInfiniteFunction.class,FiveParamInfiniteFunction.class,java.util.function.Function.class,java.util.function.BiFunction.class,TripleFunction.class,QuadFunction.class,QuintFunction.class,SextupleFunction.class,SeptupleFunction.class,ParamlessFunction.class,InfiniteParamFunction.class,java.util.function.Consumer.class);
    public static type bigint=new type(long.class);
    public static type _boolean=new type(boolean.class);
    public static type _void=new type(void.class);
    @SuppressWarnings("all")
    public static type or(Class a,Class b){
        return new type(a,b);
    }
}