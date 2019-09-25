package Code_99_LuanShua;

//no need to read
//https://leetcode-cn.com/problems/score-after-flipping-matrix/solution/fan-zhuan-ju-zhen-hou-de-de-fen-by-leetcode/

public class Code_0861 {
    public int matrixScore(int[][] A) {
        int R = A.length, C = A[0].length;
        int ans = 0;
        for (int c = 0; c < C; ++c) {
            int col = 0;
            for (int r = 0; r < R; ++r)
                col += A[r][c] ^ A[r][0];
            ans += Math.max(col, R - col) * (1 << (C-1-c));
        }
        return ans;
    }
}
