package lester.github.com.practice;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

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

    @Test
    public void reverse() throws Exception {
        Assert.assertEquals("a", StringPractice.reverse("a"));
        Assert.assertEquals("cba", StringPractice.reverse("abc"));
    }

    @Test
    public void count() throws Exception {
        Assert.assertEquals(14, StringPractice.count(3));
    }

    @Test
    public void testLambda() throws Exception {
        Arrays.asList("a", "b", "c").forEach( e -> System.out.println(e));
    }

    @Test
    public void testAddUsingString() throws Exception {
        Assert.assertEquals("214", StringPractice.addUsingString("91", "123"));
        Assert.assertEquals("937557391", StringPractice.addUsingString("19283746", "918273645"));
    }

    @Test
    public void testTimestamp() throws Exception {
        LocalDateTime now = LocalDateTime.now().withNano(0);
        Assert.assertEquals("2017-07-01 10:25:00", Timestamp.valueOf(now));
    }
}