package Code_99_HOT_100;

import java.util.Arrays;

public class Code_0128 {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length<=0)
            return 0;
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1)
                dp[i]=dp[i-1]+1;
            else if(nums[i]==nums[i-1])
                dp[i]=dp[i-1];
            else
                dp[i]=1;
        }
        int res=1;
        for(int i=0;i<dp.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
