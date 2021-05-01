package javaUpgrade.javaAPI;

import java.util.Objects;

/**
 * @program: Testcode
 * @description: 热量统计
 * @author: Fuwen
 * @create: 2021-05-01 16:24
 **/
public class Dish {
    private int Calories;

    private String name;

    private String number;

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "Calories=" + Calories +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(Calories, dish.Calories) &&
                Objects.equals(name, dish.name) &&
                Objects.equals(number, dish.number);
    }

    @Override
    public int hashCode() {
        return this.hash(Calories, name, number);
    }

    private int hash(Object...objects) {
        if (objects==null){
            return 0;
        }
        int result=0;
        for (Object o :
                objects) {
            result=result+1;
        }
        return result;
    }
}
