package Code_99_JZOFFER;

import java.util.LinkedList;

public class Code_59_2 {


}
class MaxQueue{
    private LinkedList<Integer> queue;
    private LinkedList<Integer> max_queue;

    public MaxQueue() {
        queue=new LinkedList<>();
        max_queue=new LinkedList<>();
    }

    public int max_value() {
        if(queue.isEmpty())
            return -1;
        return max_queue.peekFirst();
    }

    public void push_back(int value) {
        while(!max_queue.isEmpty()&&max_queue.peekLast()<value){
            max_queue.pollLast();
        }
        max_queue.addLast(value);
        queue.addLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty())
            return -1;
        int front=queue.removeFirst();
        if(max_queue.peekFirst()==front)
            max_queue.pollFirst();
        return front;
    }
}
