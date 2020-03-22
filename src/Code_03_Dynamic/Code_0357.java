package Code_03_Dynamic;

public class Code_0357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        int[] dp=new int[11];
        dp[1]=10;
        dp[2]=81;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]*(11-i);
        }
        int res=0;
        for(int i=1;i<=n&&i<11;i++)
            res+=dp[i];
        return res;
    }
}
