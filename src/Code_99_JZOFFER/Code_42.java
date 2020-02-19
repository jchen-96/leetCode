package Code_99_JZOFFER;

public class Code_42 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<=0)
            return 0;
        int[] dp=new int[nums.length];
        int res=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(dp[i-1]<0)
                dp[i]=nums[i];
            else
                dp[i]=nums[i]+dp[i-1];

            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
