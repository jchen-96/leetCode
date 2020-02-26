package Code_99_JZOFFER;

public class Code_63 {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2)
            return 0;
        int mini=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            res=Math.max(res,prices[i]-mini);
            mini=Math.min(mini,prices[i]);
        }
        return res;
    }
}
