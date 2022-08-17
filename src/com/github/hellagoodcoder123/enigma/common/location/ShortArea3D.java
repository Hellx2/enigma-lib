package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class ShortArea3D {
    public ShortCoord3D start;
    public ShortCoord3D end;
    public boolean isInArea(ShortCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public ShortArea3D(ShortCoord3D start,ShortCoord3D end){
        this.start=start;
        this.end=end;
    }
    public ShortArea3D(short startX,short startY,short startZ,ShortCoord3D end) throws UnrequiredException {
        this.start=new ShortCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public ShortArea3D(short startX,short startY,short startZ,short endX,short endY,short endZ) throws UnrequiredException {
        this.start=new ShortCoord3D(startX,startY,startZ);
        this.end=new ShortCoord3D(endX,endY,endZ);
    }
    public ShortArea3D(ShortCoord3D start,short endX,short endY,short endZ) throws UnrequiredException {
        this.start=start;
        this.end=new ShortCoord3D(endX,endY,endZ);
    }
}