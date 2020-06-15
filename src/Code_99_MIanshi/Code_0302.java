package Code_99_MIanshi;

import java.util.Stack;

public class Code_0302 {
}

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int x) {
        if(stack.empty()){
            stack.push(x);
            minStack.push(x);
            return;
        }
        if(x<minStack.peek()){
            minStack.push(x);
            stack.push(x);
        }else{
            stack.push(x);
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

