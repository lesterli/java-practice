package lester.github.com.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lyy on 2017/6/28.
 * Stream API (java.util.stream) 函数式编程
 * 简化集合处理，高效的聚合操作
 * 创造性地支持并行处理
 */
public class StreamDemo {
    private enum Status {OPEN, CLOSED};

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }

    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );

        final long totalPointsOfOpenTasks = tasks.stream()
                .filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Task :: getPoints)
                .sum();
        System.out.println("Total points (status is OPEN): " + totalPointsOfOpenTasks);

        //并行处理
        final long totalPoints = tasks.stream()
                .parallel()
                .mapToInt( Task::getPoints )
                .sum();
        System.out.println( "Total points (all tasks): " + totalPoints );

        try {
            Files.list(new File(".").toPath())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
