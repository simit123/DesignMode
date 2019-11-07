package decorator_pattern;

/**
 * @author by wuYang
 * @date 2019/11/7
 * @describe 组件的具体实现：就是具体的被装饰者（所要装饰的具体对象）
 * 装饰模式：对原对象没有任何侵入，扩展原对象的功能。
 */

class Boy extends Person {

    @Override
    public void dressed() {
        System.out.println("穿了内衣内裤");
    }


}
