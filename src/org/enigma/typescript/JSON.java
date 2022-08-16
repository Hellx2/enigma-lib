package org.enigma.typescript;

import org.enigma.function.TripleFunction;

public interface JSON {
    java.lang.Object parse(String text,TripleFunction<java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object> reviver);
    java.lang.Object parse(String text);
    java.lang.String stringify(java.lang.Object value,TripleFunction<java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object> replacer,java.lang.String space);
    java.lang.String stringify(java.lang.Object value,TripleFunction<java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object> replacer,int space);
    java.lang.String stringify(java.lang.Object value,TripleFunction<java.lang.Object,java.lang.String,java.lang.Object,java.lang.Object> replacer);
    java.lang.String stringify(java.lang.Object value,java.lang.String space);
    java.lang.String stringify(java.lang.Object value,int space);
    java.lang.String stringify(java.lang.Object value);
    java.lang.String stringify(java.lang.Object value,int[] replacer,java.lang.String space);
    java.lang.String stringify(java.lang.Object value,int[] replacer,int space);
    java.lang.String stringify(java.lang.Object value,int[] replacer);
    java.lang.String stringify(java.lang.Object value,java.lang.String[] replacer,java.lang.String space);
    java.lang.String stringify(java.lang.Object value,java.lang.String[] replacer,int space);
    java.lang.String stringify(java.lang.Object value,java.lang.String[] replacer);
}