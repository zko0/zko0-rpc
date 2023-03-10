package cn.zko0.myRpc;

import cn.zko0.myRpc.annotation.ServiceScan;
import cn.zko0.myRpc.api.HelloService;
import cn.zko0.myRpc.provider.DefaultServiceProvider;
import cn.zko0.myRpc.registry.NacosServiceRegistry;
import cn.zko0.myRpc.serialize.KryoSerializer;
import cn.zko0.myRpc.server.NettyRpcServer;



/**
 * @author duanfuqiang
 * @date 2023/2/8 17:45
 * @description
 */
@ServiceScan("cn.zko0.myRpc.service")
public class NettyTestServer {
    public static void main(String[] args) {
        //这里需要使用接口名，否则client无法获取服务
        //HelloService helloService = new HelloServiceImpl();
        NettyRpcServer nettyRpcServer =new NettyRpcServer(new DefaultServiceProvider());
        //注册服务时需要添加服务接口信息==>HelloService
        //nettyRpcServer.publishService(helloService,HelloService.class.getCanonicalName());
        nettyRpcServer.start();
    }
}
