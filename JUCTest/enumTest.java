package JUCTest;

public enum  enumTest {
    one(1,"齐"),two(2,"楚"),three(3,"燕"),four(4,"赵"),five(5,"魏"),six(6,"韩");

     private Integer retCode;
     private String retMessage;
    enumTest(Integer retCode,String retMessage){
        this.retCode=retCode;
        this.retMessage=retMessage;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public static enumTest forEachIt(int index){
        enumTest[] values = enumTest.values();
        for (enumTest element:values){
            if (index==element.getRetCode()){
                return element;
            }
        }
        return null;
    }

}
