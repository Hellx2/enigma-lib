package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class FloatArea2D {
    public FloatCoord2D start;
    public FloatCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public FloatArea2D(FloatCoord2D start,FloatCoord2D end){
        this.start=start;
        this.end=end;
    }
    public FloatArea2D(float startX,float startY,FloatCoord2D end) throws UnrequiredException {
        this.start=new FloatCoord2D(startX,startY);
        this.end=end;
    }
    public FloatArea2D(float startX,float startY,float endX,float endY) throws UnrequiredException {
        this.start=new FloatCoord2D(startX,startY);
        this.end=new FloatCoord2D(endX,endY);
    }
    public FloatArea2D(FloatCoord2D start,float endX,float endY) throws UnrequiredException {
        this.start=start;
        this.end=new FloatCoord2D(endX,endY);
    }
}