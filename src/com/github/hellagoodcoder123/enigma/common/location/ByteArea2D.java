package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ByteArea2D {
    public ByteCoord2D start;
    public ByteCoord2D end;
    public boolean isInArea(ByteCoord2D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY());
    }
    public ByteArea2D(ByteCoord2D start,ByteCoord2D end){
        this.start=start;
        this.end=end;
    }
    public ByteArea2D(byte startX,byte startY,ByteCoord2D end) throws UnrequiredException {
        this.start=new ByteCoord2D(startX,startY);
        this.end=end;
    }
    public ByteArea2D(byte startX,byte startY,byte endX,byte endY) throws UnrequiredException {
        this.start=new ByteCoord2D(startX,startY);
        this.end=new ByteCoord2D(endX,endY);
    }
    public ByteArea2D(ByteCoord2D start,byte endX,byte endY) throws UnrequiredException {
        this.start=start;
        this.end=new ByteCoord2D(endX,endY);
    }
}