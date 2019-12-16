package Code_03_Dynamic;

///https://leetcode-cn.com/problems/count-square-submatrices-with-all-ones/

//do again
public class Code_1277 {

    //    N的立方的解法
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int len = Math.min(n, m);
        int res = 0;
        boolean[][][] dp = new boolean[m][n][len];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = (matrix[i][j] == 1);
                res += dp[i][j][0] ? 1 : 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < len; k++) {
                    dp[i][j][k] = (matrix[i][j] == 1
                            && dp[i - 1][j][k - 1] && dp[i - 1][j - 1][k - 1] && dp[i][j - 1][k - 1]);
                    if (dp[i][j][k])
                        res++;
                }
            }
        }
        return res;
    }

    //    N的平方解法
    public int countSquares_2(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        int res=0;

        for(int i=0;i<m;i++)
            res+=dp[i][0]=matrix[i][0];
        for(int i=0;i<n;i++)
            res+=dp[0][i]=matrix[0][i];
        if(matrix[0][0]==1)
            res--;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    res+=dp[i][j];
                }
            }
        }


        return res;

    }
}
