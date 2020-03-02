package Code_03_Dynamic;

public class Code_0309 {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<dp.length;i++){
            if(i==0){
                dp[0][0]=0;
                dp[0][1]=-prices[0];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            if(i==1)
                dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
            else
                dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
