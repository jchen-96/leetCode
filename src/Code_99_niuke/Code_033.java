package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_033 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        if(s1==null||s2==null||s1.length()==0||s2.length()==0){
            System.out.println(-1);
            return;
        }
        getdp(s1,s2);


    }
    private static void getdp(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n][m];

        int maxi=1;
        int maxj=-1;
        int res=-1;

        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(0)) {
                dp[i][0] = 1;
                maxi=i;
                maxj=0;
                res=1;
            }
        }

        for(int i=0;i<m;i++){
            if(s1.charAt(0)==s2.charAt(i)) {
                dp[0][i] = 1;
                maxi=0;
                maxj=1;
                res=1;
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>res){
                        maxi=i;
                        maxj=j;
                        res=dp[i][j];
                    }
                }
            }
        }
        if(res==-1){
            System.out.println(-1);
            return;
        }
        System.out.println(s1.substring(maxi-res+1,maxi+1));
    }

}
