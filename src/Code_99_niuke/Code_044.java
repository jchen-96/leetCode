package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_044 {
    public static void main(String[] args)throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        String aim=reader.readLine();
        reader.close();
        System.out.println(isSub(aim,s1,s2)?"YES":"NO");
    }
    private static boolean isSub(String aim,String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        char[] a=aim.toCharArray();
        if(c1.length+c2.length!=a.length)
            return false;
        boolean[][] dp=new boolean[c1.length+1][c2.length+1];
        dp[0][0]=true;
        for(int i=1;i<=c1.length;i++){
            if(c1[i-1]!=a[i-1])
                break;
            dp[i][0]=true;
        }
        for(int j=1;j<=c2.length;j++){
            if(c2[j-1]!=a[j-1])
                break;
            dp[0][j]=true;
        }
        for(int i=1;i<=c1.length;i++){
            for(int j=1;j<=c2.length;j++){
                if((c1[i-1]==a[i+j-1]&&dp[i-1][j])||c2[j-1]==a[i+j-1]&&dp[i][j-1])
                    dp[i][j]=true;
            }
        }
        return dp[c1.length][c2.length];
    }
}
