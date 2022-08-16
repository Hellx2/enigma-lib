package org.enigma.common.location;

public class ByteCoord2D {
    private byte x;
    private byte y;
    public byte getX(){
        return x;
    }
    public byte getY(){
        return y;
    }
    public void setX(byte x){
        this.x=x;
    }
    public void setY(byte y){
        this.y=y;
    }
    public void set(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ShortCoord2D coord){
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public void set(IntCoord2D coord){
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public void set(byte x,byte y) {
        setX(x);
        setY(y);
    }
    public ByteCoord2D(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public ByteCoord2D(ShortCoord2D coord){
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public ByteCoord2D(IntCoord2D coord){
        setX((byte)coord.getX());
        setY((byte)coord.getY());
    }
    public ByteCoord2D(byte x,byte y) {
        setX(x);
        setY(y);
    }
}