package builder_pattern;

/**
 * @author by wuYang
 * @date 2019/6/6
 * @describe
 * 具体的builder类
 */

class SmartHumanBuilder implements IBuildHuman{

    private Human human = new SmartHuman();
    @Override
    public IBuildHuman buildHead() {
        human.setHead("大头");
        return this;
    }

    @Override
    public IBuildHuman buildBody() {
        human.setBody("strong");
        return this;
    }

    @Override
    public IBuildHuman buildHand() {
        human.setHand("手");
        return this;
    }

    @Override
    public IBuildHuman buildFoot() {
        human.setFoot();
        return this;
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
