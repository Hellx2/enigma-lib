package org.enigma.typescript;

public interface DataView {
    ArrayBuffer buffer=null;
    int byteLength=0;
    int byteOffset=0;
    float getFloat32(int byteOffset,boolean littleEndian);
    float getFloat32(int byteOffset);
    double getFloat64(int byteOffset,boolean littleEndian);
    double getFloat64(int byteOffset);
    byte getInt8(int byteOffset);
    short getInt16(int byteOffset,boolean littleEndian);
    short getInt16(int byteOffset);
    int getInt32(int byteOffset,boolean littleEndian);
    int getInt32(int byteOffset);
    byte getUint8(int byteOffset);
    short getUint16(int byteOffset,boolean littleEndian);
    short getUint16(int byteOffset);
    int getUint32(int byteOffset,boolean littleEndian);
    int getUint32(int byteOffset);
    void setFloat32(int byteOffset,float value,boolean littleEndian);
    void setFloat32(int byteOffset,float value);
    void setFloat64(int byteOffset,double value,boolean littleEndian);
    void setFloat64(int byteOffset,double value);
    void setInt8(int byteOffset,byte value);
    void setInt16(int byteOffset,short value,boolean littleEndian);
    void setInt16(int byteOffset,short value);
    void setInt32(int byteOffset,int value,boolean littleEndian);
    void setInt32(int byteOffset,int value);
    void setUint8(int byteOffset,byte value);
    void setUint16(int byteOffset,short value,boolean littleEndian);
    void setUint16(int byteOffset,short value);
    void setUint32(int byteOffset,int value,boolean littleEndian);
    void setUint32(int byteOffset,int value);
}