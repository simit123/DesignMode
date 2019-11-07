package proxy_pattern;

/**
 * @author by wuYang
 * @date 2019/6/17
 * @describe
 */

import java.lang.reflect.Proxy;

/**
 * 代理模式的角色描述：
 * Subject：抽象主题-声明真实主题和代理的共同接口方法（事情执行步骤）
 * RealSubject：真实主题类-该类表示所代理的真实对象（事情执行步骤的具体实现）
 * ProxySubject：代理类-该类持有真实主题类的引用，在其所实现的接口方法中调用真实主题类中相应的接口方法执行，以实现代理的目的
 * Client：代理模式的执行逻辑
 */

class Client {

    public static void main(String[] args) {
        initStaticProxy();
        initDynamicProxy();
    }

    /**
     * 静态代理使用
     */
    private static void initStaticProxy(){
        //构建具体对象
        XiaoMin xiaoMin = new XiaoMin();
        //构造代理律师对象
        ILawsuit lawyer = new Lawyer(xiaoMin);

        //通过代理律师执行具体诉讼逻辑
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    /**
     * 动态代理的使用
     */
    private static void initDynamicProxy(){
        //构造具体对象
        XiaoMin xiaoMin = new XiaoMin();

        //构造动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMin);

        //获取被代理类的classLoader
        ClassLoader loader = xiaoMin.getClass().getClassLoader();

        //构造具体的代理律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},dynamicProxy);
        //通过代理律师执行具体诉讼逻辑
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
    /**
     * 静态代理和动态代理的区别：
     * 本质区别：静态代理的代理者一般由程序员手动实现，也就是编译阶段class的的编译文件就已经存在，动态代理是通过反射机制动态地生成代理者对象，所以
     * 编译阶段根本不知道代理谁，到底代理谁是在运行时阶段决定。
     * 具体区别：
     * 1.动态代理代理对象不明确，可以复用，一个代理类可以代理多个被代理类
     * 2.动态代理通过反射调用被代理对象方法，需要实现InvocationHandler接口
     */

}
