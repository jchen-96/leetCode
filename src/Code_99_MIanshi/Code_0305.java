package Code_99_MIanshi;

import java.util.Stack;

public class Code_0305 {
}
//优化代码
class SortedStack {
    Stack<Integer> stack;
    Stack<Integer> helpStack;
    public SortedStack() {
        stack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty()) {
            stack.push(val);
        } else if (stack.peek() < val) {
            while (!stack.empty() && stack.peek() < val) {
                helpStack.push(stack.pop());
            }
            stack.push(val);
        } else if (helpStack.empty() || helpStack.peek() <= val) {
            helpStack.push(val);
        }else{
            while (!helpStack.empty() && helpStack.peek() > val) {
                stack.push(helpStack.pop());
            }
            helpStack.push(val);
        }
    }

    public void pop() {
        while (!helpStack.empty()) {
            stack.push(helpStack.pop());
        }
        if (!isEmpty()) {
            stack.pop();
        }

    }

    public int peek() {
        while (!helpStack.empty()) {
            stack.push(helpStack.pop());
        }
        if (isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.empty();
    }
}


