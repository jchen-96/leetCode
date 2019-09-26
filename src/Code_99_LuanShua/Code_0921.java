package Code_99_LuanShua;

//https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
//easy

import java.util.Stack;

public class Code_0921 {
    public int minAddToMakeValid(String S) {

        Stack<Character> stack=new Stack<>();
        char[] cc=S.toCharArray();
        int count=0;
        for (int i=0;i<cc.length;i++){
            if(stack.empty()){
                if(cc[i]==')')
                    count++;
                else
                    stack.push(cc[i]);
            }else{
                if(cc[i]=='('){
                    stack.push(cc[i]);
                }else{
                    stack.pop();
                }
            }
        }
        while (!stack.empty()){
            count++;
            stack.pop();
        }
        return count;

    }
}
