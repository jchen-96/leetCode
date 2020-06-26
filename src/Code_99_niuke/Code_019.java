package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_019 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int[] arr=new int[n];
        s=reader.readLine().trim().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(countdp(arr,m));
    }
    private static int mod=1000000007;

    //暴力递归
    private static int count_v(int[] coins,int i,int aim){
        int res=0;
        if(i==coins.length){
            res=aim==0?1:0;
        }else{
            for(int k=0;coins[i]*k<=aim;k++){
                res+=count_v(coins,i+1,aim-k*coins[i]);
            }
        }
        return res;
    }
    private static int countdp(int[] coins,int aim){
        int N=coins.length;
        //dp[i][j]表示在使用arr[0,...i]货币的情况下，组成钱数j有多少种方法
        int[][] dp=new int[N+1][aim+1];
        for(int i=0;i<=N;i++)
            dp[i][0]=1;
        for(int i=1;i<=aim;i++)
            dp[0][i]=i%coins[0]==0?1:0;
        for(int i=1;i<=N-1;i++){
            for(int j=1;j<=aim;j++){
                dp[i][j]=dp[i-1][j];
                dp[i][j]+=j-coins[i]>=0?dp[i][j-coins[i]]:0;
                dp[i][j]%=mod;
            }
        }
        return dp[coins.length-1][aim];

    }
}
