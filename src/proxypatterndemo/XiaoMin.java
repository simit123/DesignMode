package proxypatterndemo;

/**
 * @author by wuYang
 * @date 2019/6/17
 * @describe
 */

/**
 * 真实主题类：
 * 被代理的真实对象，执行步骤的具体实现
 */

class XiaoMin implements ILawsuit {


    @Override
    public void submit() {
        System.out.println("申请仲裁！");
    }

    @Override
    public void burden() {
        System.out.println("证据充足！");
    }

    @Override
    public void defend() {
        System.out.println("进行辩护！");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！");
    }
}
