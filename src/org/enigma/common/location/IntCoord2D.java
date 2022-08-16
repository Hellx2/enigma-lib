package org.enigma.common.location;

public class IntCoord2D {
    private int x;
    private int y;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void set(IntCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ShortCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public void set(int x,int y) {
        setX(x);
        setY(y);
    }
    public IntCoord2D(IntCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(ShortCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(ByteCoord2D coord){
        setX(coord.getX());
        setY(coord.getY());
    }
    public IntCoord2D(int x,int y) {
        setX(x);
        setY(y);
    }
}