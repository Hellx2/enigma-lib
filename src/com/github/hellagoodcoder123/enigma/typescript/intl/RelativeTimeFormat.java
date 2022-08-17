package com.github.hellagoodcoder123.enigma.typescript.intl;

public interface RelativeTimeFormat {
    String format(int value,String unit);
    RelativeTimeFormatPart[] formatToParts(int value,String unit);
    ReslovedRelativeTimeFormatOptions resolvedOptions();
}