package Code_03_Dynamic;

public class Code_0714 {
    public int maxProfit(int[] prices, int fee) {
        if(prices==null||prices.length==0)
            return 0;
        int[][] dp=new int[prices.length][2];
        for(int i=0;i< dp.length;i++){
            if(i==0){
                dp[0][0]=0;
                dp[0][1]=-prices[0]-fee;
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i][0]-prices[i]-fee);
        }
        return dp[prices.length-1][0];
    }
}
