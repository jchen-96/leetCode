package Code_99_JZOFFER;

public class Code_47 {
    public int maxValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int t1=0;
                int t2=0;
                if(i-1>=0){
                    t1=grid[i-1][j];
                }
                if(j-1>=0)
                    t2=grid[i][j-1];
                grid[i][j]+=Math.max(t1,t2);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
