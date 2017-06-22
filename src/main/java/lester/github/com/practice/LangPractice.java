package lester.github.com.practice;

/**
 * Created by lyy on 2017/6/19.
 */
public class LangPractice {
    public static void main(String[] args) {
        int i = 255;
        String intStr = Integer.toString(i);
        String strInt = String.valueOf(i);
        System.out.println(intStr);
        System.out.println(strInt);
        System.out.println(intStr.equals(strInt));
        System.out.println(intStr == strInt);
    }
}
