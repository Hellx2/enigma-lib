package org.enigma.common.location;

public class FloatCoord2D {
    private float x;
    private float y;
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void set(FloatCoord2D coord){
        setX(coord.getX());
        setY(coord.getX());
    }
    public void set(float x,float y){
        setX(x);
        setY(y);
    }
    public FloatCoord2D(FloatCoord2D coord){
        setX(coord.getX());
        setY(coord.getX());
    }
    public FloatCoord2D(float x,float y) {
        setX(x);
        setY(y);
    }
}