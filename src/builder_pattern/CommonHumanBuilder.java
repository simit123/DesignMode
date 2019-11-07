package builder_pattern;

/**
 * @author by wuYang
 * @date 2019/6/6
 * @describe
 */

class CommonHumanBuilder implements IBuildHuman {
    @Override
    public IBuildHuman buildHead() {
        return null;
    }

    @Override
    public IBuildHuman buildBody() {
        return null;
    }

    @Override
    public IBuildHuman buildHand() {
        return null;
    }

    @Override
    public IBuildHuman buildFoot() {
        return null;
    }

    @Override
    public Human createHuman() {
        return null;
    }
}
