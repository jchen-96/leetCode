package Code_99_niuke;

import java.util.*;

public class Code_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        MinStack minStack = new MinStack();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] ss = s.trim().split(" ");
            if (ss[0].equals("push")) {
                minStack.push(Integer.valueOf(ss[1]));
            } else if (ss[0].equals("getMin")) {
                System.out.println(minStack.getMin());
            } else {
                minStack.pop();
            }
        }
    }
}

class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int i) {
        stack.push(i);
        if (stack1.isEmpty()) {
            stack1.push(i);
        } else {
            stack1.push(stack1.peek() < i ? stack1.peek() : i);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        stack1.pop();
    }

    public int getMin() {
        return stack1.peek();
    }
}
