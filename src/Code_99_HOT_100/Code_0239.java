package Code_99_HOT_100;

import java.util.LinkedList;


//下次再说
public class Code_0239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length<2)
            return nums;
        LinkedList<Integer> queue=new LinkedList();
        int[] result=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(queue.peek()<=i-k){
                queue.poll();
            }
            if(i+1>=k){
                result[i-k+1]=nums[queue.peek()];
            }
        }
        return result;
    }
}
