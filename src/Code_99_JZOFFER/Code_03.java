package Code_99_JZOFFER;



public class Code_03 {
    public int findRepeatNumber(int[] nums) {
        if(nums==null||nums.length==0)
            return -1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int index=nums[i]%n;
            nums[index]+=n;
        }
        for (int i=0;i<n;i++){
            if(nums[i]>=2*n)
                return i;
        }
        return -1;
    }
}
