package builder_pattern;

/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 *
 * 定义一个对象创建所需要的过程
 * 抽象的build
 */

interface IBuildHuman {
    public IBuildHuman buildHead();
    public IBuildHuman buildBody();
    public IBuildHuman buildHand();
    public IBuildHuman buildFoot();
    public Human createHuman();

}
