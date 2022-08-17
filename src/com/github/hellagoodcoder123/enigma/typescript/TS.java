package com.github.hellagoodcoder123.enigma.typescript;

import org.enigma.typescript.nodejs.*;

public interface TS {
    java.lang.Object eval(String x);
    int parseInt(java.lang.String string,int radix);
    int parseInt(java.lang.String string);
    float parseFloat(java.lang.String string);
    boolean isNaN(int number);
    boolean isFinite(int number);
    String decodeURI(String encodedURI);
    String decodeURIComponent(String encodedURIComponent);
    String encodeURI(String uri);
    String encodeURIComponent(String uriComponent);
    String encodeURIComponent(Number uriComponent);
    String encodeURIComponent(Boolean uriComponent);
    String escape(String string);
    String unescape(String string);
    <T> T structuredClone(T value,java.lang.Object transfer);
    <T> T structuredClone(T value);
    void gc();
    public ObjectConstructor Object;
    public FunctionConstructor Function;
    public StringConstructor String;
    public BooleanConstructor Boolean;
    public NumberConstructor Number;
    public RegExpConstructor RegExp;
    public ErrorConstructor Error;
    public EvalErrorConstructor EvalError;
    public RangeErrorConstructor RangeError;
    public ReferenceErrorConstructor ReferenceError;
    public SyntaxErrorConstructor SyntaxError;
    public TypeErrorConstructor TypeError;
    public URIErrorConstructor URIError;
    public ArrayConstructor Array;
    public ArrayBufferConstructor ArrayBuffer;
    public DataViewConstructor DataView;
    public Int8ArrayConstructor Int8Array;
    public Uint8ArrayConstructor Uint8Array;
    public Uint8ClampedArrayConstructor Uint8ClampedArray;
    public Int16ArrayConstructor Int16Array;
    public Uint16ArrayConstructor Uint16Array;
    public Int32ArrayConstructor Int32Array;
    public Uint32ArrayConstructor Uint32Array;
    public Float32ArrayConstructor Float32Array;
    public Float64ArrayConstructor Float64Array;
    public org.enigma.typescript.nodejs.Process process;
    public Console console;
    public class duplicates {
        DateConstructor Date;
    }
    public class types {
        java.lang.Object[] PropertyKey={String.class,Number.class,Symbol.class};
        java.lang.Object any=java.lang.Object.class;
    }
    public java.lang.Object undefined=null;
    public int Infinity=1/0;
    public int NaN=0/0;
    public Math Math;
    public Date Date;
    public JSON JSON;
}