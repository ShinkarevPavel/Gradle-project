package com.epam.gradle;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            throw new NumberFormatException("String is not number");
        }
        return NumberUtils.createDouble(str) > 0;
    }
}
