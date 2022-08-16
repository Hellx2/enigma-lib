package org.enigma.typescript.nodejs;

import org.enigma.typescript.*;

public interface ReadableStream extends EventEmitter {
    boolean readable=false;
    java.lang.String read(int size);
    java.lang.String read();
    ReadableStream setEncoding(java.lang.String encoding);
    ReadableStream pause();
    ReadableStream resume();
    boolean isPaused();
    <T extends WritableStream> T pipe(T destination,java.lang.Object options);
    <T extends WritableStream> T pipe(T destination);
    ReadableStream unpipe(WritableStream destination);
    ReadableStream unpipe();
    void unshift(java.lang.String chunk,java.lang.String encoding);
    void unshift(java.lang.String chunk);
    void unshift(Uint8Array chunk,java.lang.String encoding);
    void unshift(Uint8Array chunk);
    ReadableStream wrap(ReadableStream oldStream);
}