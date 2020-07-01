package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_031 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        if(s1==null||s2==null||s1.length()==0||s2.length()==0)
            System.out.println("");

        int[][] dp=getdp(s1,s2);
        System.out.println(restore(s1,s2,dp));



    }



    public static int[][] getdp(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[s1.length()][s2.length()];
        boolean f=false;
        for(int i=0;i<n;i++){
            if(f||s2.charAt(0)==s1.charAt(i)){
                dp[i][0]=1;
                f=true;
            }
        }
        f=false;
        for(int i=0;i<m;i++){
            if(f||s2.charAt(i)==s1.charAt(0)){
                dp[0][i]=1;
                f=true;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                if(s1.charAt(i)==s2.charAt(j))
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+1);
            }
        }
        return dp;
    }
    private static String restore(String s1,String s2,int[][] dp){
        int n=s1.length()-1;
        int m=s2.length()-1;
        char[] res=new char[dp[n][m]];
        int index=res.length-1;
        while (index>=0){
            if(m>0&&dp[n][m]==dp[n][m-1])
                m--;
            else if(n>0&&dp[n][m]==dp[n-1][m])
                n--;
            else{
                res[index--]=s1.charAt(n);
                m--;
                n--;
            }

        }
        return String.valueOf(res);
    }

}
