package lester.github.com.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lyy on 2017/7/2.
 */
public class QuickSortDemoTest {
    @Test
    public void quickSort() throws Exception {
        QuickSortDemo sort = new QuickSortDemo();
        int[] data = {3, 1, 5, 8, 9, 2, 6, 4, 0, 10, 3};
        sort.quickSort(data, 0, data.length -1);
        Assert.assertEquals(0, data[0]);
        Assert.assertEquals(3, SearchSubNumSum.binarySearch(data, 0, data.length - 1, 3));
    }

}