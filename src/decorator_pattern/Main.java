package decorator_pattern;

/**
 * @author by wuYang
 * @date 2019/11/7
 * @describe
 */

class Main {
    public static void main(String[] args) {
        //新建一个被装饰者对象
        Person person = new Boy();

        //新建一个装饰者对象，然后通过装饰者去修饰被装饰者
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();

        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
