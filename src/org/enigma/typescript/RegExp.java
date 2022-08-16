package org.enigma.typescript;

public interface RegExp {
    String flags=null;
    boolean sticky=false;
    boolean unicode=false;
    boolean dotAll=false;
    RegExpExecArray exec(String string);
    boolean test(String string);
    String source=null;
    boolean global=false;
    boolean ignoreCase=false;
    boolean multiline=false;
    int lastIndex=0;
    RegExp compile(String pattern,String flags);
    RegExp complie(String pattern);
}