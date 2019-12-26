package site.biwin.netty.rpc.provider;

import site.biwin.netty.rpc.api.IRpcHellService;

/**
 * @author wangli
 * @Description
 * @create 2019-12-26
 */
public class RpcHelloServiceImpl implements IRpcHellService {

    @Override
    public String hello(String name) {
        return "Hello" + name + "!";
    }
}
