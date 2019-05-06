package com.github.utopia.auth.common.properties;


/**
 * 图形验证码认证配置类
 * 图形验证码有：长，宽，验证码长度，过期时间这些属性，短信验证码 也有验证码产长度，过期时间属性
 * 所以采用图形验证码继承短信验证码的方式，图形验证码中只包含长宽 的属性；
 * @author tianzehua
 * @date 2019/05/06
 */
public class ImageCodeProperties  extends SmsCodeProperties{

    public ImageCodeProperties() {
        setLength(4);
    }

    private int width = 67;
    private int height = 23;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
