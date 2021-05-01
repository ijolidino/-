package javaUpgrade.javaAPI;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: Testcode
 * @description: javaAPI练习
 * @author: Fuwen
 * @create: 2021-05-01 16:23
 **/
public class JavaAPI {
    public static void main(String[] args) {
        Dish dish = null;
        List<Dish> dishes=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dish=new Dish();
            dish.setCalories(10*i);
            dish.setName(i+"");
            dishes.add(dish);
        }
        List<Dish> lowCalories=new ArrayList<>();
        for (Dish dish1 :
                dishes) {
            if (dish1.getCalories()<50){
                lowCalories.add(dish1);
            }
        }
        Collections.sort(lowCalories, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        List<String> lowCaloriesName=new ArrayList<>();
        for (Dish dish2 :
                lowCalories) {
            lowCaloriesName.add(dish2.getName());
        }
        System.out.println(Arrays.toString(lowCaloriesName.toArray()));
        List<String> LowCaloriesName=dishes.stream().filter(d->d.getCalories()<50).sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).collect(Collectors.toList());

        List<String> LowCaloriesName1=dishes.parallelStream().filter(d->d.getCalories()<50).sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).collect(Collectors.toList());
        for (String d :
                lowCaloriesName) {
            System.out.println(d);
        }
        System.out.println("----------------------");
        for (String a :
                LowCaloriesName) {
            System.out.println(a);
        }
        System.out.println("----------------------");
        for (String a :
                LowCaloriesName1) {
            System.out.println(a);
        }
        System.out.println(lowCaloriesName==LowCaloriesName);
    }

}
