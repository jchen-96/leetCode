package Code_99_LuanShua;

public class Code_0695 {
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count=0;
                    dfs(grid,i,j);
                    res=Math.max(res,count);
                }
            }
        }
        return res;

    }
    private boolean isValid(int[][] grid,int i,int j){
        return i>=0&&i<grid.length&&j>=0&&j<grid[0].length;
    }
    private void dfs(int[][] grid,int i,int j){
        if(grid[i][j]==0)
            return;
        count++;
        grid[i][j]=0;
        for(int k=0;k<4;k++){
            int newi=i+dir[k][0];
            int newj=j+dir[k][1];
            if(isValid(grid,newi,newj))
                dfs(grid,newi,newj);
        }
    }

    private static int count=0;
    private static int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};

}
