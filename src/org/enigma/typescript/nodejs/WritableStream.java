package org.enigma.typescript.nodejs;

import org.enigma.function.ParamlessFunction;
import org.enigma.typescript.*;

public interface WritableStream extends EventEmitter {
    boolean writable=false;
    boolean write(Uint8Array buffer,java.util.function.Function<org.enigma.typescript.Error,Void> cb);
    boolean write(Uint8Array buffer,org.enigma.function.ParamlessFunction<Void> cb);
    boolean write(Uint8Array buffer);
    boolean write(java.lang.String buffer,java.util.function.Function<org.enigma.typescript.Error,Void> cb);
    boolean write(java.lang.String buffer,org.enigma.function.ParamlessFunction<Void> cb);
    boolean write(java.lang.String buffer);
    boolean write(java.lang.String str,java.lang.String encoding,java.util.function.Function<org.enigma.typescript.Error,Void> cb);
    boolean write(java.lang.String str,java.lang.String encoding,ParamlessFunction<Void> cb);
    boolean write(java.lang.String str,java.lang.String encoding);
    WritableStream end(ParamlessFunction<Void> cb);
    WritableStream end();
    WritableStream end(java.lang.String data,ParamlessFunction<Void> cb);
    WritableStream end(Uint8Array data,ParamlessFunction<Void> cb);
    WritableStream end(java.lang.String data);
    WritableStream end(Uint8Array data);
    WritableStream end(java.lang.String str,java.lang.String encoding,ParamlessFunction<Void> cb);
    WritableStream end(java.lang.String str,java.lang.String encoding);
}