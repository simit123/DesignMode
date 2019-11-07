package builder_pattern;

/**
 * @author by wuYang
 * @date 2019/6/5
 * @describe
 * 构建者模式创建computer对象
 * 常用的builder写法
 */

class Computer {

    private String mouse;
    private String keyboard;
    private String host;

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Computer(Builder builder) {
        this.mouse = builder.mouse;
        this.host = builder.host;
        this.keyboard = builder.keyboard;
    }

    public static class Builder{
        public Builder() {
        }

        private String mouse;
        private String keyboard;
        private String host;

        public Builder setMouse(String mouse){
            this.mouse = mouse;
            return this;
        }

        public Builder setKeyboard(String keyboard){
            this.keyboard = keyboard;
            return this;
        }

        public Builder setHost(String host){
            this.host = host;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
