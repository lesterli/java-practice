package lester.github.com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lyy on 2017/6/22.
 * 在一般情况下，这个问题的最简单的解决方法是使用动态规划。可以得到以下的递推公式：
 * f(n,k)=(f(n-1,k)+k) mod n, f(1,k)=0
 */
public class JosephusProblem {
    
    public static int simulate(int total, int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++) {
            list.add(i);
        }
        int startIndex = 0;
        int removeIndex;
        while (true) {
            int length = startIndex + number -1;
            if (length > list.size() -1) {
                removeIndex = length % list.size();
            } else {
                removeIndex = length;
            }
            list.remove(removeIndex);
            startIndex = removeIndex;
            if (list.size() == 1) {
                return list.get(0);
            }
            System.out.println(list.toString());
        }
    }

    public static int[] arrayOfJosephus(int total, int number) {
        int[] man = new int[total];

        for(int count = 1, i = 0, index = -1;
            count <= total; count++) {
            do {
                index = (index+1) % total;  // 环状处理
                if(man[index] == 0)
                    i++;

                if(i == number) {
                    i = 0;
                    break;
                }
            } while(true);

            man[index] = count;
            System.out.println(Arrays.toString(man));
        }

        return man;
    }

    public static int recursion(int total, int number) {
        int position = 0;
        for (int i = 2; i <= total; i++) {
            position = (position + number) % i; // f(n,k)=(f(n-1,k)+k) mod n
        }
        return position + 1;
    }
}
