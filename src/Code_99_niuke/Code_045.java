package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_045 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int m=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            s=reader.readLine().trim().split(" ");
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }
        System.out.println(getRes(arr));

    }
    private static int getRes(int[][] arr){
        int[][] dp=new int[arr.length][arr[0].length];
        int m=dp.length;
        int n=dp[0].length;
        dp[m-1][n-1]=arr[m-1][n-1]<0?(arr[m-1][n-1]*-1+1):1;
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=arr[i][n-1]>=dp[i+1][n-1]?1:dp[i+1][n-1]-arr[i][n-1];
        }
        for(int j=n-2;j>=0;j--){
            dp[m-1][j]=arr[m-1][j]>=dp[m-1][j+1]?1:dp[m-1][j+1]-arr[m-1][j];
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                int min=Math.min(dp[i][j+1],dp[i+1][j]);
                dp[i][j]=arr[i][j]>=min?1:min-arr[i][j];
            }
        }
        return dp[0][0];
    }
}
