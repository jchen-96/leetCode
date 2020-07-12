package Code_99_JZOFFER;

public class Code_49 {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<dp.length;i++){
            int min=Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            if(min==dp[i2]*2)
                i2++;
            if(min==dp[i3]*3)
                i3++;
            if(min==dp[i5]*5)
                i5++;
            dp[i]=min;

        }
        return dp[n-1];
    }
}
