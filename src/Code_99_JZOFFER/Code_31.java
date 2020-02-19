package Code_99_JZOFFER;

import java.util.Stack;

public class Code_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed==null||popped==null||pushed.length!=popped.length)
            return false;
        Stack<Integer> stack=new Stack<>();
        int pushindex=0;
        int popindex=0;


        while (pushindex<pushed.length){
            if(stack.isEmpty()||stack.peek()!=popped[popindex]){
                stack.push(pushed[pushindex]);
                pushindex++;
            }else{
                popindex++;
                stack.pop();

            }
        }
        while (popindex<popped.length&&popped[popindex]==stack.peek()){
            stack.pop();
            popindex++;
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Code_31 code_31 = new Code_31();
        code_31.validateStackSequences(new int[]{2,1,0},new int[]{1,2,0});
    }
}
