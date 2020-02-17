package Code_99_JZOFFER;

public class Code_14 {
    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max((i-j)*j,Math.max(dp[i],dp[i-j]*j));
            }
        }
        return dp[n];
    }
}
