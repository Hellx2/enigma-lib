package com.github.hellagoodcoder123.enigma.typescript;

public interface ArrayBuffer {
    int byteLength=0;
    ArrayBuffer slice(int begin,int end);
    ArrayBuffer slice(int begin);
}