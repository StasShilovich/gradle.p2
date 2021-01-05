package com.shilovich.gt;

import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;
import static org.apache.commons.lang3.math.NumberUtils.compare;
import static org.apache.commons.lang3.math.NumberUtils.createInteger;
import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (isCreatable(str)) {
            Integer number = createInteger(str);
            return compare(number, INTEGER_ZERO) > 0;
        }
        return false;
    }
}