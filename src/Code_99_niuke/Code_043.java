package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_043 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine().trim();
        String s2=reader.readLine().trim();
        String[] s=reader.readLine().split(" ");
        reader.close();
        int ic=Integer.parseInt(s[0]);
        int dc=Integer.parseInt(s[1]);
        int rc=Integer.parseInt(s[2]);
        System.out.println(minEdit(s1,s2,ic,dc,rc));

    }
    private static int minEdit(String s1,String s2,int ic,int dc,int rc){
        if(s1==null||s2==null)
            return 0;
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        dp[0][0]=0;


        for(int i=1;i<=s1.length();i++){
            dp[i][0]=i*dc;
        }
        for(int i=1;i<=s2.length();i++){
            dp[0][i]=ic*i;
        }

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=dp[i-1][j-1]+rc;
                }
                dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+dc);
                dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+ic);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
