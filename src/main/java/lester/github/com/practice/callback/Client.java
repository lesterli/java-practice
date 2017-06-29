package lester.github.com.practice.callback;

/**
 * Created by lyy on 2017/6/27.
 * 模拟客户端
 */
public class Client implements CSCallBack {

    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    /**
     * 类似 Thread 类的 start() 方法
     */
    public void  sendMsg(final String msg) {
        System.out.println("Client: send msg: " + msg);
        new Thread(new Runnable() {
            @Override
            public void run() {
                server.getClientMsg(Client.this, msg);
            }
        }).start();
        System.out.println("Client: async send success");
    }
    @Override
    public void getResponseStatus(String status) {
        System.out.println("Client: Server callback status: " + status);
    }
}
