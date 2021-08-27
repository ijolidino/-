package javaUpgrade.DO;

/**
 * @program: Testcode
 * @description: 香蕉实体类实现
 * @author: Fuwen
 * @create: 2021-05-20 21:46
 **/
public class bananaImpl extends banana{
    private String height;
    private String with;

    @Override
    public String getHeight() {
        return height;
    }

    @Override
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String getWith() {
        return with;
    }

    @Override
    public void setWith(String with) {
        this.with = with;
    }
}
