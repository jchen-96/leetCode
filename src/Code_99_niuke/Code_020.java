package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_020 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        if(n==0){
            System.out.println(0);
            return;
        }

        int[] arr=new int[n];
        String[] ss=reader.readLine().trim().split(" ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(ss[i]);

        int[] help=new int[n+2];
        help[0]=1;
        help[n+1]=1;
        for(int i=1;i<=n;i++){
            help[i]=arr[i-1];
        }
        System.out.println(processdp(help,1,n));


    }
    private static int process(int[] arr,int l,int r){
        if(l==r)
            return arr[l-1]*arr[l]*arr[r+1];
        int max=Math.max(process(arr,l+1,r)+arr[l-1]*arr[l]*arr[r+1],process(arr,l,r-1)+arr[l-1]*arr[r]*arr[r+1]);
        for(int i=l+1;i<r;i++){
            max=Math.max(max,process(arr,l,i-1)+process(arr,i +1,r)+arr[i]*arr[l-1]*arr[r+1]);
        }
        return max;
    }
    private static int processdp(int[] arr,int l,int r){
        int N=arr.length;
        //dp[i][j] 标识处理help数组中，打爆help[i....j]这些气球获得的最大分数
        int[][] dp=new int[N-1][N-1];
        for(int i=l;i<=r;i++){
            dp[i][i]=arr[i-1]*arr[i]*arr[i+1];
        }
        for(int i=r;i>=l;i--){
            for(int j=i+1;j<=r;j++){
                dp[i][j]=Math.max(dp[i+1][j]+arr[i]*arr[i-1]*arr[j+1],dp[i][j-1]+arr[j]*arr[i-1]*arr[j+1]);
                for(int m=i+1;m<=j-1;m++){
                    dp[i][j]=Math.max(dp[i][j],dp[i][m-1]+arr[m]*arr[i-1]*arr[j+1]+dp[m+1][j]);
                }
            }
        }
        return dp[l][r];

    }
}
