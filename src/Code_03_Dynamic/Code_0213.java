package Code_03_Dynamic;

public class Code_0213 {
    public int rob(int[] nums){
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    private int rob(int[] nums,int l,int r){
        if(r-l<=1)
            return Math.max(nums[l],nums[r]);
        int[] dp=new int[r-l+1];
        dp[0]=nums[l];
        dp[1]=nums[l+1];
        dp[2]=nums[l+2]+nums[l];
        for(int i=l+3;i<=r;i++){
            dp[i-l]=nums[i]+Math.max(dp[i-2-l],dp[i-3-l]);
        }
        return Math.max(dp[r-1-l],dp[r-l]);
    }
}
