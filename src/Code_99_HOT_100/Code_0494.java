package Code_99_HOT_100;


//背包的动态规划，下次做好好看看这个系列问题
public class Code_0494 {
    public int findTargetSumWays(int[] nums, int S) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum<S||(sum+S)%2==1){
            return 0;
        }
        int target=(sum+S)/2;
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i:nums){
            for(int j=target;j>=i;j--){
                dp[j]+=dp[j-i];
            }
        }
        return dp[target];
    }
}
