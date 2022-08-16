package org.enigma.typescript.intl;

import org.enigma.typescript.Date;

public interface DateTimeFormat {
    DateTimeFormatPart[] formatToParts(int date);
    DateTimeFormatPart[] formatToParts(Date date);
    DateTimeFormatPart[] formatToParts();
    String format(int date);
    String format(Date date);
    String format();
    ResolvedDateTimeFormatOptions resolvedOptions();
}