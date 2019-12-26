package site.biwin.netty.rpc.api;

/**
 * @author wangli
 * @Description
 * @create 2019-12-26
 */
public interface IRpcService {
    /** 加 */
    int add(int a, int b);
    /** 减 */
    int sub(int a, int b);
    /** 乘 */
    int mult(int a, int b);
    /** 除 */
    int div(int a, int b);
}
