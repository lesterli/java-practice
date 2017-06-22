package lester.github.com.practice;

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
}
