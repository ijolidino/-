public class doubleCheckSingleton {
    private  static volatile doubleCheckSingleton singleton=null;
    private doubleCheckSingleton(){};
    public static doubleCheckSingleton getInstance(){
        if (singleton==null){
            synchronized (doubleCheckSingleton.class){
                if (singleton==null){
                    singleton=new doubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
