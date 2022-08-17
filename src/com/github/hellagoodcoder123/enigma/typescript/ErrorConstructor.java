package com.github.hellagoodcoder123.enigma.typescript;

public interface ErrorConstructor {
    Error prototype=null;
    void captureStackTrace(java.lang.Object targetObject,Function constructorOpt);
    void captureStackTrace(java.lang.Object targetObject);
    java.lang.Object prepareStackTrace(Error err,org.enigma.typescript.nodejs.CallSite[] stackTraces);
    int stackTraceLimit=0;
}