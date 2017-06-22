package lester.github.com.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lyy on 2017/6/22.
 */
public class StringPracticeTest {

    @Test
    public void getFirstNonDuplicateChar() throws Exception {
        Assert.assertEquals('h', StringPractice.getFirstNonDuplicateChar("hello"));
        Assert.assertEquals('l', StringPractice.getFirstNonDuplicateChar("google"));
        Assert.assertEquals('c', StringPractice.getFirstNonDuplicateChar("abbcad"));
    }

}