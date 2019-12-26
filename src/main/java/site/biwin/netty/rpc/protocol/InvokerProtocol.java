package site.biwin.netty.rpc.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangli
 * @Description
 * @create 2019-12-26
 */
@Data
public class InvokerProtocol implements Serializable {
    //类名
    private String className;
    //函数名称
    private String methodName;
    //参数类型
    private Class<?>[] parames;
    //参数列表
    private Object[] values;
}
