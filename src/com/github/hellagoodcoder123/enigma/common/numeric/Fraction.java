package com.github.hellagoodcoder123.enigma.common.numeric;

public class Fraction {
    public int numerator;
    public int denominator;
    public double value(){
        return numerator/denominator;
    }
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
}