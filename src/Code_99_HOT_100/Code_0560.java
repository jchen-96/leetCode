package Code_99_HOT_100;

public class Code_0560 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length <= 0)
            return 0;

//        dp[i][j]表示，从nums[i]到nums[j]这些数字的和
        int[] dp=new int[nums.length];
        int res=0;
        for(int i=0;i<nums.length;i++){
            dp[0]=nums[i];
            for(int j=i+1;j<nums.length;j++){
                dp[j-i]=dp[j-i-1]+nums[j];
            }
            for(int x=0;x<nums.length-i;x++){
                if(dp[x]==k)
                    res+=1;
            }
        }

        return res;
    }
}
