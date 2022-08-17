package com.github.hellagoodcoder123.enigma.common.location;

import com.github.hellagoodcoder123.enigma.common.err.*;

public class FloatArea3D {
    public FloatCoord3D start;
    public FloatCoord3D end;
    public boolean isInArea(FloatCoord3D coord){
        return (coord.getX()>=start.getX())&&(coord.getX()<=end.getX())&&(coord.getY()>=start.getY())&&(coord.getY()<=end.getY())&&(coord.getZ()>=start.getZ())&&(coord.getZ()<=end.getZ());
    }
    public FloatArea3D(FloatCoord3D start,FloatCoord3D end){
        this.start=start;
        this.end=end;
    }
    public FloatArea3D(float startX,float startY,float startZ,FloatCoord3D end) throws UnrequiredException {
        this.start=new FloatCoord3D(startX,startY,startZ);
        this.end=end;
    }
    public FloatArea3D(float startX,float startY,float startZ,float endX,float endY,float endZ) throws UnrequiredException {
        this.start=new FloatCoord3D(startX,startY,startZ);
        this.end=new FloatCoord3D(endX,endY,endZ);
    }
    public FloatArea3D(FloatCoord3D start,float endX,float endY,float endZ) throws UnrequiredException {
        this.start=start;
        this.end=new FloatCoord3D(endX,endY,endZ);
    }
}