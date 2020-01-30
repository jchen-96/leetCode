package Code_99_HOT_100;

import java.util.Arrays;

//二分查找，边界要想清楚哦

public class Code_0033 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return -1;
        int start=0;
        int end=nums.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
