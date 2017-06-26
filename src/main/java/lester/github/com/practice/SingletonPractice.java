package lester.github.com.practice;

/**
 * Created by lyy on 2017/6/26.
 * 一般来说，单例模式有五种写法：懒汉、饿汉、双重检验锁、静态内部类、枚举。
 */
public class SingletonPractice {
    private SingletonPractice() {}

    private volatile static SingletonPractice instance;

    // 双重检验锁
    public static SingletonPractice getInstance3() {
        if (instance == null) {
            synchronized (SingletonPractice.class) {
                if (instance == null) {
                    instance = new SingletonPractice();
                }
            }
        }
        return instance;
    }
    private static class SingletonHolder {
        private static final SingletonPractice INSTANCE = new SingletonPractice();
    }
    // 静态内部类
    public static final SingletonPractice getInstance4() {
        return SingletonHolder.INSTANCE;
    }

}
