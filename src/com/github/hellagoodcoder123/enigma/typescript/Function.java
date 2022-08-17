package com.github.hellagoodcoder123.enigma.typescript;

public interface Function {
    java.lang.Object apply(Function _this,java.lang.Object thisArg,java.lang.Object argArray);
    java.lang.Object apply(Function _this,java.lang.Object thisArg);
    java.lang.Object call(Function _this,java.lang.Object thisArg,java.lang.Object... argArray);
    java.lang.Object bind(Function _this,java.lang.Object thisArg,java.lang.Object... argArray);
    java.lang.String toString();
    java.lang.Object prototype=null;
    int length=0;
    java.lang.Object arguments=null;
    Function caller=null;
}