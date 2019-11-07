package decorator_pattern;

/**
 * @author by wuYang
 * @date 2019/11/7
 * @describe 抽象的装饰者，用来装饰被装饰者的东西
 */

public abstract class PersonCloth extends Person {
    /**
     * 通过这个抽象的被装饰者的引用我们可以很方便的调用具体装饰者的方法，这就是为什么
     * 我们可以在不破坏原类层次结构的情况下为类增加一些功能。
     */
    protected Person mPerson;//保持一个Person类的引用(保持一个抽象被装饰者的引用)

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        //调用person类中的dressed方法
        mPerson.dressed();
    }
}
