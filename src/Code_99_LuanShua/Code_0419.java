package Code_99_LuanShua;

//no need to read

//https://leetcode-cn.com/problems/battleships-in-a-board/
//flood fill ，深度优先搜索
public class Code_0419 {

    public static int[][] dir={
            {0,1},{0,-1},{1,0},{-1,0}
    };
    private boolean isValid(int x,int y,char[][] board){
        return (x<board.length&&y<board[0].length&&x>=0&&y>=0&&board[x][y]=='X');
    }
    public int countBattleships(char[][] board) {
        int count=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] board,int i,int j) {
        board[i][j]='.';
        for (int t=0;t<4;t++){
            int newx=i+dir[t][0];
            int newy=j+dir[t][1];
            if(isValid(newx,newy,board)){
                dfs(board,newx,newy);
            }
        }
    }
}
