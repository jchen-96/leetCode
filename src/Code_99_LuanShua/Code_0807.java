package Code_99_LuanShua;


//https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
//so easy


public class Code_0807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] left = new int[grid.length];
        int[] top = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > top[j]) {
                    top[j] = grid[i][j];
                }
                if (grid[i][j] > left[i]) {
                    left[i] = grid[i][j];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sum += Math.min(top[j] - grid[i][j], left[i] - grid[i][j]);
            }
        }
        return sum;
    }
}
