package Code_99_JZOFFER;

public class Code_60 {
    public double[] twoSum(int n) {
        int[][] dp=new int[n+1][n*6+1];
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=i;j<=6*i;j++){
                for(int k=1;k<=6;k++){
                    if(j-k<=0)
                        break;
                    dp[i][j]+=dp[i-1][j-k];
                }
            }
        }
        int total=(int)Math.pow(6,n);
        double[] res=new double[6*n-n+1];
        for(int i=0;i<res.length;i++){
            res[i]=(double) dp[n][n+i]/total;
        }
        return res;
    }
}
