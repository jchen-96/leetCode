package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_017 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int p = Integer.parseInt(s[3]);
        mem=new int[n+1][k+1];
        for(int i=0;i<mem.length;i++){
            for(int j=0;j<mem[0].length;j++){
                mem[i][j]=-1;
            }
        }
        System.out.println(dp(n,m,k,p));

    }
    private static int[][] mem;
    private static int mod=1000000007;



    //记忆化搜索，如果去掉记忆化数组，就是暴力递归了
    private static int violence(int n, int cur, int rest, int p) {
        if(mem[cur][rest]!=-1)
            return mem[cur][rest];
        if (rest == 0){
            int t=(cur == p ? 1 : 0);
            mem[cur][rest]=t;
            return t;
        }
        if (cur == 1)
            return violence(n, 2, rest - 1, p);
        if (cur == n)
            return violence(n, n - 1, rest - 1, p);
        int res=violence(n,cur+1,rest-1,p)+violence(n,cur-1,rest-1,p);
        mem[cur][rest]=res%mod;
        return res%mod;
    }

    //动态规划
    private static int dp(int n,int cur,int rest,int p){
        int[][] dp=new int[rest+1][n+1];
        dp[0][p]=1;
        for(int i=1;i<=rest;i++){
            for(int j=1;j<=n;j++){
                if(j==1){
                    dp[i][j]=dp[i-1][2];
                }else if(j==n)
                    dp[i][j]=dp[i-1][n-1];
                else
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%mod;
            }
        }
        return dp[rest][cur]%mod;
    }
}
