package Code_99_HOT_100;

import java.util.Arrays;


//字典序问题，好好看一下
public class Code_0031 {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0)
            return;

        int sort_index=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                sort_index=i-1;
                break;
            }
        }
        if(sort_index==-1){
            Arrays.sort(nums);
            return;
        }
        else{
            int temp=nums[sort_index];
            int i;
            for(i=sort_index+1;i<nums.length;i++){
                if(nums[i]<=temp){
                    break;
                }
            }
            int tt=nums[i-1];
            nums[i-1]=temp;
            nums[sort_index]=tt;
        }
        Arrays.sort(nums,sort_index+1,nums.length);
    }

}
