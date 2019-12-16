package Code_03_Dynamic;

//https://leetcode-cn.com/problems/stone-game/
//figure out 博弈问题

public class Code_0877 {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        Pair[][] dp=new Pair[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=new Pair(0,0);
            }
        }
        for(int i=0;i<n;i++){
            dp[i][i].fir=piles[i];
            dp[i][i].sec=0;
    }
        for(int k=1;k<n;k++){
            int j=k;
            for(int i=0;i<n;i++,j++){
                if(j>=n){
                    i=n;
                    continue;
                }
                int left=piles[i]+dp[i+1][j].sec;
                int right=piles[j]+dp[i][j-1].sec;
                if(left>right){
                    dp[i][j].fir=left;
                    dp[i][j].sec=dp[i+1][j].fir;
                }else{
                    dp[i][j].fir=right;
                    dp[i][j].sec=dp[i][j-1].fir;
                }
            }
        }

        Pair res=dp[0][n-1];
        return res.fir>res.sec;

}
}
class Pair{
    int fir,sec;

    public Pair(int fir, int sec) {
        this.fir = fir;
        this.sec = sec;
    }
}
