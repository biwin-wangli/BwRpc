package site.biwin.netty.rpc.provider;

import site.biwin.netty.rpc.api.IRpcService;

/**
 * @author wangli
 * @Description
 * @create 2019-12-26
 */
public class RpcServiceImpl implements IRpcService {
    /**
     * 加
     *
     * @param a
     * @param b
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 减
     *
     * @param a
     * @param b
     */
    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * 乘
     *
     * @param a
     * @param b
     */
    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    /**
     * 除
     *
     * @param a
     * @param b
     */
    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
