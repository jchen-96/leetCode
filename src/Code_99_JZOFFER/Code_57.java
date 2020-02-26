package Code_99_JZOFFER;

public class Code_57 {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int t;
        while (l<r){
            t=nums[l]+nums[r];
            if(nums[l]+nums[r]==target){
                return new int[]{nums[r],nums[l]};
            }else if(t>target)
                r--;
            else
                l++;
        }
        return new int[0];
    }
}
