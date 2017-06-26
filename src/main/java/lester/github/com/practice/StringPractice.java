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
}

