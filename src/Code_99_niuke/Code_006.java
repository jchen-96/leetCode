package Code_99_niuke;

import java.util.Scanner;
import java.util.*;

public class Code_006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        StackQ stackq = new StackQ();
        for (int i = 0; i < n; i++) {
            String s = reader.nextLine();
            String[] ss = s.trim().split(" ");
            if (ss[0].equals("add")) {
                stackq.add(Integer.parseInt(ss[1]));
            } else if (ss[0].equals("peek"))
                System.out.println(stackq.peek());
            else
                stackq.poll();
        }
    }
}

class StackQ {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void add(int i) {
        stack1.push(i);
    }

    public void poll() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
