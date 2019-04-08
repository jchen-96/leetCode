package weekContest.week131;

import java.util.Stack;


//no need to read
public class Code_1021 {
    public String removeOuterParentheses(String S) {
        if (S.length() <= 0)
            return "";
        char[] cc=S.toCharArray();
        int i = 0;
        String res = "";
        while (i < S.length()) {
            int j = i + 1;
            Stack<Character> stack = new Stack<>();
            stack.push(cc[i]);
            while (!stack.empty()){
                if(stack.peek()=='('&&cc[j]==')'){
                    stack.pop();
                }else{
                    stack.push(cc[j]);
                }
                j++;
            }
            res+=S.substring(i+1,j-1);
            i=j;
        }
        return res;

    }

    public static void main(String[] args) {
        Code_1021 code_5061=new Code_1021();
        String s=code_5061.removeOuterParentheses("(()())(())");
        System.out.println(s);

    }
}
