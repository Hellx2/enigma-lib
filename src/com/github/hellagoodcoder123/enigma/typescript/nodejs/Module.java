package com.github.hellagoodcoder123.enigma.typescript.nodejs;

public interface Module {
    boolean isPreloading=false;
    Object exports=null;
    Require require=null;
    String id=null;
    String filename=null;
    boolean loaded=false;
    Module parent=null;
    Module[] children=null;
    String path=null;
    String[] paths=null;
}