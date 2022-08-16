package org.enigma.typescript.nodejs;

public interface RefCounted {
    RefCounted ref();
    RefCounted unref();
}