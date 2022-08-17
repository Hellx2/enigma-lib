package com.github.hellagoodcoder123.enigma.typescript.nodejs;

public interface Require {
    RequireResolve resolve=null;
    Dict<org.enigma.typescript.NodeModule> cache=null;
    Module main=null;
}