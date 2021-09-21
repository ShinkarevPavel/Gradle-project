package com.epam.gradle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final String POSITIVE_INT_STRING = "25";
    private final String POSITIVE_DOUBLE_STRING = "25.98";
    private final String POSITIVE_STRING_OCTAL = "07";
    private final String NOT_DIGIT_STRING = "a";
    private final String NEGATIVE_INT_STRING = "-25";
    private final String NEGATIVE_DOUBLE_STRING = "-25.98";


    @Test
    void isNotPositiveDigitTest() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            StringUtils.isPositiveNumber(NOT_DIGIT_STRING);
        });
    }

    @Test
    void isPositiveIntNumber() {
        assertTrue(StringUtils.isPositiveNumber(POSITIVE_INT_STRING));
    }

    @Test
    void isPositiveDoubleNumber() {
        assertTrue(StringUtils.isPositiveNumber(POSITIVE_DOUBLE_STRING));
    }

    @Test
    void isPositiveOctalNumber() {
        assertTrue(StringUtils.isPositiveNumber(POSITIVE_STRING_OCTAL));
    }

    @Test
    void isPositiveIntNumber2() {
        assertFalse(StringUtils.isPositiveNumber(NEGATIVE_INT_STRING));
    }

    @Test
    void isPositiveDoubleNumber2() {
        assertFalse(StringUtils.isPositiveNumber(NEGATIVE_DOUBLE_STRING));
    }

}