package lester.github.com.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lyy on 2017/6/22.
 */
public class JosephusProblemTest {
    @Test
    public void recursion() throws Exception {
        int total = 10, number = 3;
        System.out.println(JosephusProblem.recursion(total, number));
    }

    @Test
    public void arrayOfJosephus() throws Exception {
        int total = 10, number = 3;
        int[] man = JosephusProblem.arrayOfJosephus(total, number);
        System.out.println(Arrays.toString(man));
    }

    @Test
    public void simulate() throws Exception {
        int total = 10, number = 3;
        System.out.println(JosephusProblem.simulate(total, number));
    }

}