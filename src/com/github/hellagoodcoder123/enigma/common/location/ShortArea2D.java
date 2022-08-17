package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ShortArea2D {
    public ShortCoord2D start;
    public ShortCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public ShortArea2D(ShortCoord2D start,ShortCoord2D end){
        this.start=start;
        this.end=end;
    }
    public ShortArea2D(short startX,short startY,ShortCoord2D end) throws UnrequiredException {
        this.start=new ShortCoord2D(startX,startY);
        this.end=end;
    }
    public ShortArea2D(short startX,short startY,short endX,short endY) throws UnrequiredException {
        this.start=new ShortCoord2D(startX,startY);
        this.end=new ShortCoord2D(endX,endY);
    }
    public ShortArea2D(ShortCoord2D start,short endX,short endY) throws UnrequiredException {
        this.start=start;
        this.end=new ShortCoord2D(endX,endY);
    }
}