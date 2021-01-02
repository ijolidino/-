package leetcodeTest;

import java.util.ArrayDeque;

/**
 * Create by Fuwen on 2021/1/2
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length()==1){
            return false;
        }
        int a=0;
        int l=s.length();
        int[] ints = new int[l];
        for (int i = 0; i < l; i++) {
            if (s.charAt(i)=='('){
                ints[i]=1;
                a+=1;
            }else if (s.charAt(i)==')'){
                ints[i]=-1;
                a+=-1;
            }else if (s.charAt(i)=='['){
                ints[i]=2;
                a+=2;
            }else if (s.charAt(i)==']'){
                ints[i]=-2;
                a+=-2;
            }else if (s.charAt(i)=='{'){
                ints[i]=3;
                a+=3;
            }else if (s.charAt(i)=='}'){
                ints[i]=-3;
                a+=-3;
            }
        }
        if (a!=0){
            return false;
        }
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < l; i++) {
            if (ints[i]>0){
                arrayDeque.addLast(ints[i]);
            }
            if (!arrayDeque.isEmpty()&&ints[i]<0&&arrayDeque.removeLast()+ints[i]!=0){
                return false;
            }
        }
            if (!arrayDeque.isEmpty()&&arrayDeque.removeLast()>0){
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(new ValidParentheses().isValid("()[]{}"));
//        System.out.println(new ValidParentheses().isValid("([)]"));
//        System.out.println(new ValidParentheses().isValid("{[]}"));
        System.out.println(new ValidParentheses().isValid("(){}}{"));
        System.out.println(new ValidParentheses().isValid("(){}}{{}"));

    }
}
