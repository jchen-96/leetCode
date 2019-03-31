package weekContest.week130;


//孤立的岛屿问题

public class Code_1031 {
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};

    int rows=0;
    int col=0;

    private boolean legal(int x,int y){
        if(x>=0&&y>=0&&x<rows&&y<col)
            return true;
        return false;
    }

    public int numEnclaves(int[][] A) {
        rows=A.length;
        col=A[0].length;
        for(int i=0;i<rows;i++){
            dfs(A,i,0);
            dfs(A,i,col-1);
        }
        for(int i=0;i<col;i++){
            dfs(A,0,i);
            dfs(A,rows-1,i);
        }
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(A[i][j]==1)
                    count++;
            }
        }
        return count;

    }
    private void dfs(int[][] A,int x,int y){
        if(legal(x,y)&&A[x][y]==1){
            A[x][y]=0;
            for(int i=0;i<4;i++){
                int newx=x+dir[i][0];
                int newy=y+dir[i][1];
                dfs(A,newx,newy);
            }
        }
        return;
    }
}
