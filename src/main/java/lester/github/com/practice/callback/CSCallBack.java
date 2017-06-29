package lester.github.com.practice.callback;

/**
 * Created by lyy on 2017/6/27.
 * 回调接口
 * 作为方法的参数，传递调用者的引用
 */
public interface CSCallBack {
    /**
     * 类似 Runnable 接口的 run() 方法
     */
    void getResponseStatus(String status);
}
