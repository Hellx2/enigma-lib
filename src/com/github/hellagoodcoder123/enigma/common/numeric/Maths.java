package com.github.hellagoodcoder123.enigma.common.numeric;

public class Maths {
    private Maths(){}
    public static final double PI=3.14159265358979323846;
    public static final double E=2.7182818284590452354;
    /**Finds the sine relative to x. In effect, the sine relative to x is x
     * converted to a range from -PI/2 to PI/2 then divided by PI/2;
     */
    public static final double sin(double x){
        return ((setToRangePI(x+(Math.PI/2))-(PI/2))/(PI/2));
    }
    public static final double cos(double x){
        return (setToRangePI(x)/(Math.PI/2))-1;
    }
    public static final double tan(double x){
        return (sin(x)/cos(x));
    }
    public static final double sin(double opposite,double adjacent){
        return opposite/findHypotenuse(opposite, adjacent);
    }
    public static final double cos(double opposite,double adjacent){
        return adjacent/findHypotenuse(opposite, adjacent);
    }
    public static final double tan(double opposite,double adjacent){
        return opposite/adjacent;
    }
    public static final double cot(double opposite,double adjacent){
        return adjacent/opposite;
    }
    public static final double sec(double opposite,double adjacent){
        return findHypotenuse(opposite,adjacent)/adjacent;
    }
    public static final double csc(double opposite,double adjacent){
        return findHypotenuse(opposite,adjacent)/opposite;
    }
    public static final double findHypotenuse(double opposite,double adjacent){
        return Math.sqrt(Math.pow(opposite, 2)+Math.pow(adjacent,2));
    }
    public static final double findAdjacent(double opposite,double hypotenuse){
        return Math.sqrt(hypotenuse-Math.pow(opposite,2));
    }
    public static final double findOpposite(double adjacent,double hypotenuse){
        return Math.sqrt(hypotenuse-Math.pow(adjacent,2));
    }
    public static final double setToRangePI(double x){
        double a=x;
        if(x>0){
            for(int i=0;(x-(i*Math.PI))>0;i++){
                a=(x-(i*Math.PI));
            }
        } else {
            for(int i=0;(x+(i*Math.PI))<=Math.PI;i++){
                a=(x+(i*Math.PI));
            }
        }
        return a;
    }
    public static final double trunc(double x){
        return Double.parseDouble(String.valueOf(x).split(".")[0]);
    }
    public static final double floor(double x){
        return trunc(x);
    }
    public static final double ceil(double x){
        return trunc(x)!=x?trunc(x)+1:x;
    }
    public static final double round(double x){
        return x>=(floor(x)+0.5)?ceil(x):floor(x);
    }
    public static final double log(double x){
        int a=0;
        if(x/E==1)return 1;
        for(a=0;a<x;a++){
            if(Math.pow(a,Math.E)>x){
                --a;
            }
        }
        return a;
    }
    private static boolean log$1(int b,int x){
        for(int a=0;a<x;a++){
            if(Math.pow(a,Math.E)>x){
                --a;
            }
        }
    }
}