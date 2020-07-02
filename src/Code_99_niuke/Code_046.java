package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_046 {

    private static int mod=1000000007;
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine().trim();
        reader.close();
        System.out.println(getRes(s));

    }
    public static int getRes(String s){
        if(s.startsWith("0"))
            return 0;
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            if(s.charAt(i-1)=='0'&&(s.charAt(i-2)>'2'||s.charAt(i-2)=='0'))
                return 0;
            if(s.charAt(i-1)=='0')
                dp[i]+=dp[i-2];
            if(s.charAt(i-1)>'6'&&s.charAt(i-1)<='9') {
                if (s.charAt(i - 2) == '1') {
                    dp[i] += dp[i - 2];
                    dp[i]%=mod;
                }
                dp[i]+=dp[i-1];
            }
            if(s.charAt(i-1)>'0'&&s.charAt(i-1)<='6') {
                if (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2') {
                    dp[i] += dp[i - 2];
                    dp[i]%=mod;
                }
                dp[i] += dp[i - 1];
            }
            dp[i]%=mod;
        }
        return dp[dp.length-1];
    }
}
