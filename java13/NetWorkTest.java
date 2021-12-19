package com.wufujian.java13;

/**
 * @author:gfk
 * @create:2021/12/19
 * @Description:
 * @FileName:NetWorkTest
 * @History:
 * @自定义内容:
 */

/**
 * 接口的应用：代理模式
 *
 *
 * 注意点：定义的是接口类型的对象，所以是通过接口调用相应初始化的对象的方法所以叫代理
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
//        server.browse();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface  Network{
    public void browse();
}

//被代理类
class Server implements Network{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements Network{
    private Network work;

    public ProxyServer(Network work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}