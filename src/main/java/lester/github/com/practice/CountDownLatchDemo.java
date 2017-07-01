package lester.github.com.practice;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lyy on 2017/6/26.
 * 启动n个线程，做一些事情，然后统计n个线程完成所用的时间
 * CountDownLatch 倒计数锁 当计数减至0时触发特定的事件,可以让主线程等待子线程的结束
 * CountDownLatch(int count), 参数i指定计数的次数
 * countDown() 方法, 调用一次i的值会减1
 * await() 方法, 调用线程会进入等待状态，当参数i为0的时候这个线程才继续执行
 */
public class CountDownLatchDemo {
    private static final int WORKER_AMOUNT = 5;

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(WORKER_AMOUNT);
        Worker[] workers = new Worker[WORKER_AMOUNT];
        for (int i = 0; i < WORKER_AMOUNT; i++) {
            workers[i] = new Worker(i+1, countDownLatch);
        }

        ExecutorService executor = Executors.newFixedThreadPool(WORKER_AMOUNT);
        long startTime = System.nanoTime();
        for (Worker worker : workers) {
            executor.execute(worker);
        }
        executor.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {

        }
        double estimatedTime = (System.nanoTime() - startTime)/Math.pow(10, 9);
        System.out.println("Spend time (s): " + estimatedTime);
    }

}

class Worker implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public Worker(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            System.out.println("Worker: " + id);
        } finally {
            countDownLatch.countDown();
        }
    }
}
