package Code_03_Dynamic;


//周赛动态规划
public class Code_5224 {
    int[][][] dp=new int[5005][7][16];
    //dp[i][j][k],i代表第几次掷色子,j代表最后结尾的是哪个数,k代表结尾数有连续多少个
    private static final int mod = (int)Math.pow(10,9)+7;

    int dieSimulator(int n, int[] rollMax) {
        for(int i=1;i<=6;i++)
            dp[1][i][1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=6;j++){
                for(int k=1;k<=rollMax[j-1];k++){
                    if(k!=1){
                        dp[i][j][k]=dp[i-1][j][k-1];
                    }else{
                        for(int z=1;z<=6;z++){
                            if(z!=j){
                                for(int cnt=1;cnt<=rollMax[z-1];cnt++){
                                    dp[i][j][k]=(dp[i][j][k]+dp[i-1][z][cnt])%mod;
                                }
                            }
                        }
                    }
                }
            }
        }

        int res=0;

        for(int i=1;i<=6;i++){
            for(int j=1;j<=rollMax[i-1];j++){
                res=(res+dp[n][i][j])%mod;
            }
        }
        return res;
    }
}
