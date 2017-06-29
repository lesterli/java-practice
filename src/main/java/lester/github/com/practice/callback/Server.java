package lester.github.com.practice.callback;

/**
 * Created by lyy on 2017/6/27.
 * 模拟服务端
 */
public class Server {
    public void getClientMsg(CSCallBack csCallBack, String msg) {
        System.out.println("Server: from client get msg: " + msg);
        try {
            Thread.sleep( 5 * 1000);
        } catch (InterruptedException e) {

        }
        System.out.println("Server: process success, return status 200");
        csCallBack.getResponseStatus("200");

    }
}
