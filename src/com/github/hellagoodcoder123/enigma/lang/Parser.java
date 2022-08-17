package com.github.hellagoodcoder123.enigma.lang;

public class Parser {
    public static String[] excludeStrings(String x){
        String[] $1=x.split("\"");
        for(int i=0;i<$1.length;i++){
            if(i/2!=Math.round(i/2))$1[i]="";
        }
        return $1;
    }
    public static String[] onlyStrings(String x){
        String[] $1=x.split("\"");
        for(int i=0;i<$1.length;i++){
            if(i/2==Math.round(i/2))$1[i]="";
        }
        return $1;
    }
    public static String a(String x){
        String[] $1=x.split("\n");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        return $2;
    }
    public static String b(String x){
        String[] z=onlyStrings(x);
        String[] y=excludeStrings(x);
        String a="";
        for(int i=0;i<y.length;i++){
            String[] $1=y[i].split("= ");
            String $2=$1[0];
            for(int j=1;j<$1.length;j++){
                $2+="="+$1[j];
            }
            String[] $3=$2.split(" =");
            String $4=$3[0];
            for(int j=1;j<$3.length;j++){
                $4+="="+$3[j];
            }
            a+=$4;
            a+=z[i];
        }
        return a;
    }
    public static String c(String x){
        String y=excludeStrings(x);
        String[] $1=y.split("+ ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+="+"+$1[i];
        }
        String[] $3=$2.split(" +");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+="+"+$3[i];
        }
        return $4;
    }
    public static String d(String x){
        String y=excludeStrings(x);
        String[] $1=y.split("- ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        String[] $3=$2.split(" -");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+=$3[i];
        }
        return $4;
    }
    public static String e(String x){
        String[] $1=x.split("} ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        String[] $3=$2.split(" }");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+=$3[i];
        }
        return $4;
    }
    public static String f(String x){
        String[] $1=x.split("; ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        String[] $3=$2.split(" ;");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+=$3[i];
        }
        return $4;
    }
    public static String g(String x){
        String[] $1=x.split("& ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        String[] $3=$2.split(" &");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+=$3[i];
        }
        return $4;
    }
    public static String h(String x){
        String[] $1=x.split("| ");
        String $2="";
        for(int i=0;i<$1.length;i++){
            $2+=$1[i];
        }
        String[] $3=$2.split(" |");
        String $4="";
        for(int i=0;i<$3.length;i++){
            $4+=$3[i];
        }
        return $4;
    }
}