import java.util.*;
public class Solution {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }
            if(A.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
