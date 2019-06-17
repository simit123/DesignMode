package proxypatterndemo;

/**
 * @author by wuYang
 * @date 2019/6/17
 * @describe
 */

/**
 * 抽象主题：
 * 定义诉讼的流程
 */

interface ILawsuit {
    /**
     * 提交申请
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 开始辩护
     */
    void defend();

    /**
     * 诉讼完成
     */
    void finish();
}
