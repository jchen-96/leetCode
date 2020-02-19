package Code_99_JZOFFER;

import java.util.Stack;

public class Code_30 {
}
class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int node) {
        if(stack1.isEmpty()){
            stack1.push(node);
            stack2.push(node);
        }else{
            stack1.push(node);
            if(stack2.peek()>node){
                stack2.push(node);
            }else{
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}