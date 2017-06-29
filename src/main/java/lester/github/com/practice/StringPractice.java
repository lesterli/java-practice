package lester.github.com.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyy on 2017/6/19.
 */
public class StringPractice {

    public static char getFirstNonDuplicateChar(String str) {
        List<Character> nonDuplicate = new ArrayList<>();
        if (str != null && str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!nonDuplicate.contains(letter)) {
                    nonDuplicate.add(letter);
                } else {
                    nonDuplicate.remove((Character) letter);
                }
            }
        } else {
            throw new IllegalArgumentException("str is NULL");
        }
        return nonDuplicate.get(0);
    }

    public static String reverse(String str) {
        if (str != null && str.length() != 0) {
            return reverse(str.substring(1)).concat(String.valueOf(str.charAt(0)));
        } else {
            return "";
        }
    }

    public static int count(int n) {
        return n == 1 ? 1 : count(n-1) + n * n;
    }

    /**
     * 用字符串表示大数，实现大数相加
     * @param str1
     * @param str2
     * @return
     */
    public static String addUsingString(String str1, String str2) {
        // 反转字符串
        char[] strArray1 = new StringBuffer(str1).reverse().toString().toCharArray();
        char[] strArray2 = new StringBuffer(str2).reverse().toString().toCharArray();

        int strLen1 = str1.length();
        int strLen2 = str2.length();
        int maxLen = strLen1 > strLen2 ? strLen1 : strLen2;
        int resultLen = maxLen + 1;
        int[] resultArray = new int[resultLen];

        // 按照数位对应相加
        for (int i = 0; i < resultLen; i++) {
            int charInt1 = i < strLen1 ? Integer.parseInt(String.valueOf(strArray1[i])) : 0;
            int charInt2 = i < strLen2 ? Integer.parseInt(String.valueOf(strArray2[i])) : 0;
            resultArray[i] = charInt1 + charInt2;
        }

        // 处理进位
        for(int i = 0; i < resultLen; i++) {
            if (resultArray[i] > 10) {
                resultArray[i] = resultArray[i]%10;
                resultArray[i+1] = resultArray[i+1] + 1;
            }
        }

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < resultLen; i++) {
            // 判断是否最后一位为0
            if (i == (resultLen - 1) && resultArray[i] == 0) {
                continue;
            }
            result.append(String.valueOf(resultArray[i]));
        }
        return result.reverse().toString();
    }
}

