import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Animal {
    Animal(){
        System.out.println("Animal.");
    }
    public static class Dog extends Animal{
        Dog(){
            System.out.println("dog.");
        }

        public static void main(String[] args) {
            Dog dog = new Dog();
        }
    }

}
