public class Singleton {
public static class S{
    public static final Singleton INSTANCE =new Singleton();

}
private Singleton(){}
public static final Singleton getInstance(){
    return S.INSTANCE;
}
}
