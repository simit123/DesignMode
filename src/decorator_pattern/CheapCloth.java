package decorator_pattern;

/**
 * @author by wuYang
 * @date 2019/11/7
 * @describe
 */

class CheapCloth extends PersonCloth {

    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    /**
     * 穿短裤
     */
    private void dressShorts() {
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
