package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Code_186{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            s=reader.readLine().trim().split(" ");
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(s[j]);
            }
        }
        System.out.println(getMinPath(arr));


    }

    private static int getMinPath(int[][] arr){
        if(arr==null||arr.length==0||arr[0]==null||arr[0].length==0)
            return 0;
        int less=Math.min(arr.length,arr[0].length);
        int more=Math.max(arr.length,arr[0].length);
        boolean rowmore=more==arr.length;//判断是不是行数较多
        int[] dp=new int[less];
        dp[0]=arr[0][0];
        for(int i=1;i<less;i++){
            dp[i]=dp[i-1]+(rowmore?arr[0][i]:arr[i][0]);
        }
        for(int i=1;i<more;i++){
            dp[0]=dp[0]+(rowmore?arr[i][0]:arr[0][i]);
            for(int j=1;j<less;j++){
                dp[j]=Math.min(dp[j],dp[j-1])+(rowmore?arr[i][j]:arr[j][i]);
            }
        }
        return dp[less-1];
    }


//    不进行状态压缩
//    private static int getMinPath(int[][] arr){
//        int[][] dp=new int[arr.length][arr[0].length];
//        dp[0][0]=arr[0][0];
//        for(int i=1;i<arr.length;i++){
//            dp[i][0]=dp[i-1][0]+arr[i][0];
//        }
//        for(int i=1;i<arr[0].length;i++){
//            dp[0][i]=dp[0][i-1]+arr[0][i];
//        }
//        for(int i=1;i<arr.length;i++){
//            for(int j=1;j<arr[0].length;j++){
//                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+arr[i][j];
//            }
//        }
//        return dp[arr.length-1][arr[0].length-1];
//    }
}