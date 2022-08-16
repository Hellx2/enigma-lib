package org.enigma.common.location;

public class ShortCoord2D {
    private short x;
    private short y;
    public short getX(){
        return x;
    }
    public short getY(){
        return y;
    }
    public void setX(short x){
        this.x=x;
    }
    public void setY(short y){
        this.y=y;
    }
    public void set(IntCoord2D coord){
        setX((short)coord.getX());
        setY((short)coord.getY());
    }
    public void set(ShortCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(short x,short y) {
        setX(x);
        setY(y);
    }
    public ShortCoord2D(ShortCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public ShortCoord2D(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public ShortCoord2D(IntCoord2D coord){
        setX((short)coord.getX());
        setY((short)coord.getY());
    }
    public ShortCoord2D(short x,short y) {
        setX(x);
        setY(y);
    }
}