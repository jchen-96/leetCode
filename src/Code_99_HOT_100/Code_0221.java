package Code_99_HOT_100;

import java.util.Map;

public class Code_0221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length<=0)
            return 0;
        int dp[][] =new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]=='1')
                dp[i][0]=1;
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]=='1')
                dp[0][i]=1;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(
                            Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]
                    )+1;
                }
            }
        }
        int res=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res= Math.max(res,dp[i][j]);
            }
        }
        return res*res;
    }
}
