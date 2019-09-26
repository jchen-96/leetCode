package Code_99_LuanShua;
//https://leetcode-cn.com/problems/unique-paths-iii/

//走迷宫，深度优先搜索
//todo

public class Code_0980 {

    private static int[][] dir=new int[][]{
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
    };

    private boolean isValid(int x,int y,int[][] grid){
        return (x>=0&&y>=0&&
                x<grid.length&&y<grid.length&&
                grid[x][y]==0);
    }
    public int uniquePathsIII(int[][] grid) {
        return 0;
    }
}
