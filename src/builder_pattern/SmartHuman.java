package builder_pattern; /**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 具体的产品
 */
class SmartHuman extends Human {
    @Override
    public void setFoot() {
        foot = "脚";
    }
}
