package Code_99_MIanshi;

import java.util.Stack;

public class Code_0304 {
}

class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int value) {
        stack1.push(value);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty())
            return -1;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else
            return stack2.pop();
    }
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty())
            return -1;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        } else
            return stack2.peek();
    }
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }

}
