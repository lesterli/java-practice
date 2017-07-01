package lester.github.com.practice;

/**
 * Created by lyy on 2017/6/26.
 * 寻找和为定值的多个数
 * 题目：
 * 输入：包含n个整数的数组array，整数sum
 * 要求：从数组array中随意取几个数，使其和等于sum
 * 输出：所有的可能组合
 */
public class SearchSubNumSum {

    public static int binarySearch(int[] array, int start, int end, int value) {
        int middle = start/2 + end/2;
        if (end < start) {
            return -1;
        }
        if (end == (start + 1)) {
            if (array[start] == value) {
                return  start;
            } else if (array[end] == value) {
                return end;
            }
        } else if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, end, value);
        } else if (value < array[middle]) {
            return binarySearch(array, start, middle - 1, value);
        }
        return -1;
    }
}
