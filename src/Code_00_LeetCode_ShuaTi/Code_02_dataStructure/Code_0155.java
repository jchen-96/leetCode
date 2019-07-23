package Code_00_LeetCode_ShuaTi.Code_02_dataStructure;

//https://leetcode-cn.com/problems/min-stack/

import java.util.Stack;

public class Code_0155 {
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */