package com.github.hellagoodcoder123.enigma.util.game;

import java.awt.Image;

public class ModelPart {
    int x1;
    int y1;
    int z1;
    int x2;
    int y2;
    int z2;
    double rotX;
    double rotY;
    double rotZ;
    Image[] textures;
    public ModelPart(int x1,int y1,int z1,int x2,int y2,int z2,int rotX,int rotY,int rotZ,Image[] textures){
        this.x1=x1;
        this.y1=y1;
        this.z1=z1;
        this.x2=x2;
        this.y2=y2;
        this.z2=z2;
        this.rotX=rotX;
        this.rotY=rotY;
        this.rotZ=rotZ;
        this.textures=textures;
    }
}