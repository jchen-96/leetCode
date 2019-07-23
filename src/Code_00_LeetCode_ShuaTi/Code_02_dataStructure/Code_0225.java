package Code_00_LeetCode_ShuaTi.Code_02_dataStructure;

//https://leetcode-cn.com/problems/implement-stack-using-queues/

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Code_0225{

}


class MyStack {
    Queue<Integer> q1;

    /** Initialize your data structure here. */
    public MyStack() {
        q1=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0; i <q1.size()-1 ; i++) {
            q1.add(q1.poll());
        }
        return q1.poll();
    }

    /** Get the top element. */
    public int top() {
        for (int i = 0; i <q1.size()-1 ; i++) {
            q1.add(q1.poll());
        }
        int res= q1.peek();
        q1.add(q1.poll());
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */