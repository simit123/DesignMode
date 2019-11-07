package builder_pattern; /**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 构建者模式：为了创建复杂对象，将对象的构建过程封装起来，实现解耦
 *  构建者模式的角色：
 * Director 负责执行具体的创建动作,统一组装过程,隐藏构建的细节,通过具体的builder构建产品（具体的builder中有具体产品对象）
 * IBuild 抽象的build 定义对象创建所需要的步骤
 * ConcreteBuilder 具体的build
 * ConcreteProduct 具体的产品，通过配置各种零部件生产出的具体产品
 * product 抽象的产品类，抽象出生产各种产品所需要的零部件
 *
 *
 */
class Test {
    public static void main(String[] args) {


        IBuildHuman mBuilder = new SmartHumanBuilder();

        Director director = new Director(mBuilder);

        Human human = director.createHuman();

        System.out.println(human.getHand());

        Computer computer = new Computer.Builder().setHost("local")
                .setKeyboard("三星")
                .setMouse("雷蛇")
                .build();

        System.out.println(computer.getKeyboard());
    }
}
