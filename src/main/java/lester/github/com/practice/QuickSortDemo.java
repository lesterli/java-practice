package lester.github.com.practice;

/**
 * Created by lyy on 2017/7/1.
 */
public class QuickSortDemo {

    public void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int x = array[start];
        int j = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] < x) {
                swap(array, ++j, i);
            }
        }
        swap(array, start, j);
        quickSort(array, start, j - 1);
        quickSort(array, j + 1, end);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
