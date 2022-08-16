package org.enigma.typescript.intl;

public interface NumberFormat {
    NumberFormatPart[] formatToParts(int number);
    NumberFormatPart[] formatToParts(long number);
    String format(int value);
    String format(long value);
    ResolvedNumberFormatOptions resolvedOptions();
    String formatRange(int start,int end);
    String formatRange(long start,int end);
    String formatRange(int start,long end);
    String formatRange(long start,long end);
    NumberFormatPart[] formatRangeToParts(int start,int end);
    NumberFormatPart[] formatRangeToParts(long start,int end);
    NumberFormatPart[] formatRangeToParts(int start,long end);
    NumberFormatPart[] formatRangeToParts(long start,long end);
}