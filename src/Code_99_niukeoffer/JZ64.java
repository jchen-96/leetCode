package Code_99_niukeoffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        LinkedList<Integer> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            while (!q.isEmpty()&&num[q.peekLast()]<num[i])
                q.pollLast();
            q.addLast(i);
            if(i-size==q.peekFirst()){
                q.pollFirst();
            }
            if(!q.isEmpty()&&i>=size-1)
                list.add(num[q.peekFirst()]);
        }
        return list;

    }
}
