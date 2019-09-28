package Code_04_DFS;

//https://leetcode-cn.com/problems/surrounded-regions/

//no need to read


import java.util.Arrays;

public class Code_0130 {
    public void solve(char[][] board) {
        if(board==null||board.length<=0)
            return;

        char[][] copy=new char[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                copy[i][j]=board[i][j];
            }
        }

        for(int i=0;i<board[0].length;i++){
            dfs(copy,0,i);
        }
        for(int i=0;i<board[0].length;i++){
            dfs(copy,board.length-1,i);
        }
        for(int i=0;i<board.length;i++){
            dfs(copy,i,0);
        }
        for(int i=0;i<board.length;i++){
            dfs(copy,i,board[0].length-1);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(copy[i][j]=='O')
                    board[i][j]='X';
            }
        }


    }

    private static int[][] dir={
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
    };


    private void dfs(char[][] board,int x,int y){
        if(board[x][y]=='X')
            return;
        board[x][y]='X';
        for(int i=0;i<4;i++){
            int newx=x+dir[i][0];
            int newy=y+dir[i][1];
            if(isValid(newx,newy,board))
                dfs(board,newx,newy);
        }
    }

    private boolean isValid(int x,int y,char[][] board){
        return (x>=0&&y>=0&&
                x<board.length&&y<board[0].length&&
                board[x][y]=='O');
    }
}
