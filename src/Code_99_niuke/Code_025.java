package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_025 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine().trim());
        if(n==0)
            return;
        String[] ss=reader.readLine().trim().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<ss.length;i++){
            arr[i]=Integer.parseInt(ss[i]);
        }
        nsquare(arr);

    }
    //n方算法，最佳可以到nlog(n)
    private static void nsquare(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=1;
        int res=1;
        for(int i=1;i<arr.length;i++){
            int max=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<=arr[i])
                    max=Math.max(max,dp[j]+1);
            }
            dp[i]=max;
            res=Math.max(res,dp[i]);
        }
        int next=Integer.MAX_VALUE;

        StringBuilder sb=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            if(dp[i]==res&&arr[i]<=next){
                sb.append(arr[i]+" ");
                res--;
                next=arr[i];
            }
        }
        System.out.println(sb.reverse());

    }



}
