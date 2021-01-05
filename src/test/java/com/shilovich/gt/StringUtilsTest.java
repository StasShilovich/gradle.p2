package com.shilovich.gt;

import com.shilovich.gt.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = {"12", "10", "1", "12312"})
    public void testIsPositiveNumberPositive(String string) {
        boolean condition = StringUtils.isPositiveNumber(string);
        assertTrue(condition);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "", "-1", "-1236"})
    public void testIsPositiveNumberNegative(String string) {
        boolean condition = StringUtils.isPositiveNumber(string);
        assertFalse(condition);
    }
}