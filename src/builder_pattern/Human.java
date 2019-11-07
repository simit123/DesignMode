package builder_pattern;

/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 * 抽象的产品
 */

abstract class Human {
    public Human() {
    }

    private String head;
    private String body;
    private String hand;
    public String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }


    public abstract void setFoot();


}
