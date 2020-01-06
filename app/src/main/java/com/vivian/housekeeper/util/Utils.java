package com.vivian.housekeeper.util;

import java.util.regex.Pattern;

public class Utils {
    public static boolean isValidPhoneNumber(String number) {
        String pattern = "^1[3|4|5|7|8][0-9]\\\\d{4,8}$";
        return  Pattern.matches(pattern, number);
    }
}
