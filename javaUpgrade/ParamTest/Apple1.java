package javaUpgrade.ParamTest;

/**
 * @program: Testcode
 * @description: apple的同类
 * @author: Fuwen
 * @create: 2021-05-09 23:32
 **/
public class Apple1 {
    private int weight;

    private String color;

    public Apple1(String color, Integer weight) {
        this.weight=weight;
        this.color=color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
