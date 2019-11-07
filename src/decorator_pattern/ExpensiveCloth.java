package decorator_pattern;

/**
 * @author by wuYang
 * @date 2019/11/7
 * @describe 装饰者的具体实现
 */

class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    /**
     * 穿短袖
     */
    private void dressShirt() {
        System.out.println("穿件短袖");
    }


    /**
     * 穿皮衣
     */
    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    /**
     * 穿牛仔裤
     */
    private void dressJean() {
        System.out.println("穿条牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
