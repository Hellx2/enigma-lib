package com.github.hellagoodcoder123.enigma.typescript;

import org.enigma.typescript.intl.NumberFormatOptions;

public interface Number {
    String toLocaleString(String locales,NumberFormatOptions options);
    String toLocaleString(String[] locales,NumberFormatOptions options);
    String toLocaleString(String locales);
    String toLocaleString(String[] locales);
    String toLocaleString(NumberFormatOptions options);
    String toLocaleString();
    String toString(int radix);
    String toFixed(int fractionDigits);
    String toFixed();
    String toExponential(int fractionDigits);
    String toExponential();
    String toPrecision(int precision);
    String toPrecision();
    int valueOf();
}