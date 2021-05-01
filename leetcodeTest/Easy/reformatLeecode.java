package leetcodeTest.Easy;

import java.util.ArrayDeque;

/**
 * @program: Testcode
 * @description: 转换字符串
 * @author: Fuwen
 * @create: 2021-03-13 11:38
 **/
public class reformatLeecode {
        public String reformat(String s) {
            int num1=0,num2=0;
            char[] chars = s.toCharArray();
            for(char c:chars){
                if(c >= '0'&&c <= '9'){num1++;}
                else{num2++;}
            }//看数字字符比较多还是字母字符比较多
            if( num1-num2<-1 || num1-num2>1){return "";}
            if(num1>num2){
                num1 = 0;num2 = 1;
            }else{
                num1 = 1;num2 = 0;
            }
            for(char c:s.toCharArray()){
                if(c >= '0'&&c <= '9'){chars[num1] = c; num1 += 2;}
                else{chars[num2] = c; num2 += 2;}
            }
            return new String(chars);
        }


    public static void main(String[] args) {
        System.out.println(new reformatLeecode().reformat("covid2019"));
    }
}
