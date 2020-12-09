package extendsTEst;

public class Human {
    public Human(int a){
        System.out.println("Human");
    }
    public void fun1() {
    System.out.println("Human fun1");
    fun2();
}

    public void fun2() {
        System.out.println("Human fun2");
    }
}
