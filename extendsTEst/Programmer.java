package extendsTEst;

class Programmer extends Human {

    public Programmer(int i){
        super(1);
        System.out.println("Programmer");
    }
    public void fun1() {
        System.out.println("Programmer's fun1");
    }

    public void fun2() {
        System.out.println("Programmer's fun2");
    }
}
