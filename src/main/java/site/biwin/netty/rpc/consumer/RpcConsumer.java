package site.biwin.netty.rpc.consumer;

import site.biwin.netty.rpc.api.IRpcHellService;
import site.biwin.netty.rpc.api.IRpcService;
import site.biwin.netty.rpc.consumer.proxy.RpcProxy;

/**
 * @author wangli
 * @Description
 * @create 2019-12-27
 */
public class RpcConsumer {

    public static void main(String[] args) {
        IRpcHellService rpcHello = RpcProxy.create(IRpcHellService.class);
        System.out.println(rpcHello.hello("BiWin niu B"));

        IRpcService service = RpcProxy.create(IRpcService.class);
        System.out.println("8 + 2 = " + service.add(8, 2));
        System.out.println("8 - 2 = " + service.sub(8, 2));
        System.out.println("8 * 2 = " + service.mult(8, 2));
        System.out.println("8 / 2 = " + service.div(8, 2));
    }
}
