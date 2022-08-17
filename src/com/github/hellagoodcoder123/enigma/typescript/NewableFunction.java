package com.github.hellagoodcoder123.enigma.typescript;

import org.enigma.function.*;

@SuppressWarnings("unchecked")
public interface NewableFunction extends Function {
    <T> void apply(ParamlessFunction<T> _this,T thisArg);
    <T,A extends Array<java.lang.Object>> void apply(InfiniteParamFunction<java.lang.Object,T> _this,T thisArg,A args);
    <T,A extends Array<java.lang.Object>> void call(InfiniteParamFunction<java.lang.Object,T> _this,T thisArg,java.lang.Object... args);
    <T> T bind(T _this,T thisArg);
    <T,A0,A extends Array<java.lang.Object>,R> InfiniteParamFunction<A,R> bind(TwoParamThenInfiniteFunction<T,A0,A,R> _this,T thisArg,A0 arg0);
    <T,A0,A1,A extends Array<java.lang.Object>,R> InfiniteParamFunction<A,R> bind(ThreeParamInfiniteFunction<T,A0,A1,A,R> _this,T thisArg,A0 arg0,A1 arg1);
    <T,A0,A1,A2,A extends Array<java.lang.Object>,R> InfiniteParamFunction<A,R> bind(FourParamInfiniteFunction<T,A0,A1,A2,A,R> _this,T thisArg,A0 arg0,A1 arg1,A2 arg2);
    <T,A0,A1,A2,A3,A extends Array<java.lang.Object>,R> InfiniteParamFunction<A,R> bind(FiveParamInfiniteFunction<T,A0,A1,A2,A3,A,R> _this,T thisArg,A0 arg0,A1 arg1,A2 arg2,A3 arg3);
    <T,AX,R> InfiniteParamFunction<AX,R> bind(SingleParamAndInfiniteSecondFunction<T,AX,R> _this,T thisArg,AX... args);
}