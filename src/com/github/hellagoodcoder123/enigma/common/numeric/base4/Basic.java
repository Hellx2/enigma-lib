package com.github.hellagoodcoder123.enigma.common.numeric.base4;

import com.github.hellagoodcoder123.enigma.common.numeric.NumberOutOfRangeException;

public class Basic {
    String add(String x,String y) throws NumberOutOfRangeException {
        String $1=x;
        String $2=y;
        String $3="";
        for(var i=0;i<x.length();i++){
            String $4=$1.split("")[x.length()-i];
            String $5=addSingle($2.substring(0,1),$4);
            if($5.length()==1)$3+=$5;
            else {
                $3+=$5.charAt(1);
            }
        }
        return $1;
    }
    String addSingle(String x,String y) throws NumberOutOfRangeException {
        if(x=="0")return y;
        if(y=="0")return x;
        if(x=="1"){
            if(y=="1")return "2";
            if(y=="2")return "3";
            if(y=="3")return "4";
            if(y=="4")return "5";
            if(y=="5")return "6";
            if(y=="6")return "7";
            if(y=="7")return "8";
            if(y=="8")return "9";
            if(y=="9")return "10";
        }
        if(x=="2"){
            if(y=="1")return "3";
            if(y=="2")return "4";
            if(y=="3")return "5";
            if(y=="4")return "6";
            if(y=="5")return "7";
            if(y=="6")return "8";
            if(y=="7")return "9";
            if(y=="8")return "10";
            if(y=="9")return "11";
        }
        if(x=="3"){
            if(y=="1")return "4";
            if(y=="2")return "5";
            if(y=="3")return "6";
            if(y=="4")return "7";
            if(y=="5")return "8";
            if(y=="6")return "9";
            if(y=="7")return "10";
            if(y=="8")return "11";
            if(y=="9")return "12";
        }
        if(x=="4"){
            if(y=="1")return "5";
            if(y=="2")return "6";
            if(y=="3")return "7";
            if(y=="4")return "8";
            if(y=="5")return "9";
            if(y=="6")return "10";
            if(y=="7")return "11";
            if(y=="8")return "12";
            if(y=="9")return "13";
        }
        if(x=="5"){
            if(y=="1")return "6";
            if(y=="2")return "7";
            if(y=="3")return "8";
            if(y=="4")return "9";
            if(y=="5")return "10";
            if(y=="6")return "11";
            if(y=="7")return "12";
            if(y=="8")return "13";
            if(y=="9")return "14";
        }
        if(x=="6"){
            if(y=="1")return "7";
            if(y=="2")return "8";
            if(y=="3")return "9";
            if(y=="4")return "10";
            if(y=="5")return "11";
            if(y=="6")return "12";
            if(y=="7")return "13";
            if(y=="8")return "14";
            if(y=="9")return "15";
        }
        if(x=="7"){
            if(y=="1")return "8";
            if(y=="2")return "9";
            if(y=="3")return "10";
            if(y=="4")return "11";
            if(y=="5")return "12";
            if(y=="6")return "13";
            if(y=="7")return "14";
            if(y=="8")return "15";
            if(y=="9")return "16";
        }
        if(x=="8"){
            if(y=="1")return "9";
            if(y=="2")return "10";
            if(y=="3")return "11";
            if(y=="4")return "12";
            if(y=="5")return "13";
            if(y=="6")return "14";
            if(y=="7")return "15";
            if(y=="8")return "16";
            if(y=="9")return "17";
        }
        if(x=="9"){
            if(y=="1")return "10";
            if(y=="2")return "11";
            if(y=="3")return "12";
            if(y=="4")return "13";
            if(y=="5")return "14";
            if(y=="6")return "15";
            if(y=="7")return "16";
            if(y=="8")return "17";
            if(y=="9")return "18";
        }
        throw new NumberOutOfRangeException();
    }
}