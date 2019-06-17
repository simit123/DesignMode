package proxypatterndemo;

/**
 * @author by wuYang
 * @date 2019/6/17
 * @describe
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的实现
 * 主要是实现InvocationHandler接口
 * 通过invoke方法反射调用具体对象（被代理的对象）的方法
 */

class DynamicProxy implements InvocationHandler {

    private Object obj;//被代理对象

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理对象的方法
        Object result = method.invoke(obj,args);
        return result;
    }
}
