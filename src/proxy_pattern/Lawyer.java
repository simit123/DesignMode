package proxy_pattern;

/**
 * @author by wuYang
 * @date 2019/6/17
 * @describe
 */

/**
 * 代理类
 * 通过持有的真实对象和实现事件流程接口来实现代理功能
 */

class Lawyer implements ILawsuit{

    private XiaoMin xiaoMin;//持有真实对象的引用

    public Lawyer(XiaoMin xiaoMin) {
        this.xiaoMin = xiaoMin;
    }

    @Override
    public void submit() {
        xiaoMin.submit();
    }

    @Override
    public void burden() {
        xiaoMin.burden();
    }

    @Override
    public void defend() {
        xiaoMin.defend();
    }

    @Override
    public void finish() {
        xiaoMin.finish();
    }
}
