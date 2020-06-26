package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_012{
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

        System.out.println(processdp(arr,m));
    }
    public static int processdp(int[] coins,int target){
        int N=coins.length;
        int[][] dp=new int[N+1][target+1];
        for(int k=1;k<=target;k++){
            dp[N][k]=-1;
        }
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
                if(dp[i+1][j]!=-1)
                    dp[i][j]=dp[i+1][j];
                if(j-coins[i]>=0&&dp[i][j-coins[i]]!=-1){
                    if(dp[i][j]==-1)
                        dp[i][j]=dp[i][j-coins[i]]+1;
                    else{
                        dp[i][j]=Math.min(dp[i+1][j],dp[i][j-coins[i]]+1);
                    }
                }
            }
        }
        return dp[0][target];
    }


    private static int process(int[] coins,int i,int rest){
        if(i==coins.length)
            return rest==0?0:-1;
        int res=-1;
        for(int k=0;k*coins[i]<=rest;k++){
            int next=process(coins,i+1,rest-k*coins[i]);
            if(next!=-1)
                res=res==-1?next+k:Math.min(res,next+k);
        }
        return res;
    }




}
