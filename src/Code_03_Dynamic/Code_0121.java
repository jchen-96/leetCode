package Code_03_Dynamic;


//股票问题,只能交易一次
public class Code_0121 {
    public int maxProfit(int[] prices) {
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
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
