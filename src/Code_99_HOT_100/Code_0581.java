package Code_99_HOT_100;

import java.util.Arrays;

public class Code_0581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null||nums.length<=0)
            return 0;
        int[] copy= Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        int start=-1;
        int end=-1;
        for(int i=0;i<copy.length;i++){
            if(copy[i]!=nums[i]){
                start=i;
                break;
            }
        }
        for(int i=copy.length-1;i>=0;i--){
            if(copy[i]!=nums[i]){
                end=i;
                break;
            }
        }
        return start==-1?0:end-start+1;
    }
}
