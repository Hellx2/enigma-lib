package com.github.hellagoodcoder123.enigma.typescript.nodejs;

public interface RefCounted {
    RefCounted ref();
    RefCounted unref();
}