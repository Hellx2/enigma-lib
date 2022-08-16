package org.enigma.typescript;

import org.enigma.typescript.intl.CollatorOptions;

public interface String extends RelativeIndexable<String> {
    String padStart(int maxLength,String fillString);
    String padStart(int maxLength);
    String padEnd(int maxLength,String fillString);
    String padEnd(int maxLength);
    RegExpMatchArray match(RegExpMatchArray matcher);
    RegExpMatchArray match(RegExp regexp);
    RegExpMatchArray match(String regexp);
    String replace(String searchValue,String replaceValue);
    String replace(RegExp searchValue,String replaceValue);
    int search(int searcher);
    int search(String regexp);
    int search(RegExp regexp);
    String[] split(String splitter, int limit);
    String[] split(String splitter);
    String[] split(RegExp separator,int limit);
    String[] split(RegExp separator);
    String trimEnd();
    String trimStart();
    String trimLeft();
    String trimRight();
    int codePointAt(int pos);
    boolean includes(String searchString, int position);
    boolean includes(String searchString);
    boolean endsWith(String searchString, int endPosition);
    boolean endsWith(String searchString);
    String normalize(String form);
    String normalize();
    String repeat(int count);
    boolean startsWith(String searchString, int position);
    boolean startsWith(String searchString);
    IterableIterator<RegExpMatchArray> matchAll(RegExp regexp);
    String charAt(int pos);
    int charCodeAt(int index);
    String concat(String... strings);
    int indexOf(String searchString, int position);
    int indexOf(String searchString);
    int lastIndexOf(String searchString, int position);
    int lastIndexOf(String searchString);
    int localCompare(String that);
    String slice(int start, int end);
    String slice(int start);
    String slice();
    String substring(int start,int end);
    String substring(int start);
    String toLowerCase();
    String toLocaleLowerCase(String locales);
    String toLocaleLowerCase(String[] locales);
    String toLocaleLowerCase();
    String toUpperCase();
    String toLocaleUpperCase(String locales);
    String toLocaleUpperCase(String[] locales);
    String toLocaleUpperCase();
    String trim();
    int length=0;
    String valueOf();
    int localeCompare(String that,String locales,CollatorOptions options);
    int localeCompare(String that,String[] locales,CollatorOptions options);
    int localeCompare(String that,CollatorOptions options);
    int localeCompare(String that,String locales);
    int localeCompare(String that,String[] locales);
    int localeCompare(String that);
    //Java section
    static java.lang.String valueOf(int x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(double x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(long x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(float x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(short x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(byte x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(char x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String valueOf(boolean x){
        return x?"true":"false";
    }
    static java.lang.String valueOf(java.lang.Object x){
        return java.lang.String.valueOf(x);
    }
    static java.lang.String parseString(java.lang.Object x){
        return valueOf(x);
    }
    static java.lang.String parseString(int x){
        return valueOf(x);
    }
    static java.lang.String parseString(double x){
        return valueOf(x);
    }
    static java.lang.String parseString(float x){
        return valueOf(x);
    }
    static java.lang.String parseString(long x){
        return valueOf(x);
    }
    static java.lang.String parseString(short x){
        return valueOf(x);
    }
    static java.lang.String parseString(byte x){
        return valueOf(x);
    }
    static java.lang.String parseString(char x){
        return valueOf(x);
    }
    static java.lang.String parseString(boolean x){
        return valueOf(x);
    }
}