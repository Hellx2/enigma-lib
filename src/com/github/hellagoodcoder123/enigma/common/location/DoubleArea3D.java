package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class DoubleArea3D {
    public DoubleCoord3D start;
    public DoubleCoord3D end;
    public boolean isInArea(DoubleCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public DoubleArea3D(DoubleCoord3D start,DoubleCoord3D end){
        this.start=start;
        this.end=end;
    }
    public DoubleArea3D(double startX,double startY,double startZ,DoubleCoord3D end) throws UnrequiredException {
        this.start=new DoubleCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public DoubleArea3D(double startX,double startY,double startZ,double endX,double endY,double endZ) throws UnrequiredException {
        this.start=new DoubleCoord3D(startX,startY,startZ);
        this.end=new DoubleCoord3D(endX,endY,endZ);
    }
    public DoubleArea3D(DoubleCoord3D start,double endX,double endY,double endZ) throws UnrequiredException {
        this.start=start;
        this.end=new DoubleCoord3D(endX,endY,endZ);
    }
}