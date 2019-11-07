package builder_pattern; /**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 创建者
 */
class Director {

    private IBuildHuman iBuildHuman;

    public Director(IBuildHuman iBuildHuman) {
        this.iBuildHuman = iBuildHuman;
    }

    public Human createHuman() {
        return iBuildHuman.buildHead()
                .buildBody()
                .buildFoot()
                .buildHand()
                .createHuman();
    }
}
