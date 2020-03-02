package Code_03_Dynamic;

public class Code_0123 {
    public int maxProfit(int[] prices) {
        return maxProfit(2,prices);
    }
    private int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(k>n/2)
            return maxProfit_k_inf(prices);
        int[][][] dp=new int[n][k+1][2];
        for(int i=0;i<n;i++){
            for(int j=1;j<=k;j++) {
                if (i == 0) {
                    dp[0][j][0]=0;
                    dp[0][j][1]=-prices[0];
                    continue;
                }
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }


    //    k>n/2则是次数无限
    private int maxProfit_k_inf(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int[][] dp=new int[prices.length][2];
        for(int i=0;i< dp.length;i++){
            if(i==0){
                dp[0][0]=0;
                dp[0][1]=-prices[0];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
