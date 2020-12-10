package ErrorAndException;

public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        stackOverflowError();
    }
    private static void stackOverflowError(){
        //递归调用把栈空间撑爆，这是error
        //OutOfMemoryError
        stackOverflowError();//stackOverflowError
    }
}
