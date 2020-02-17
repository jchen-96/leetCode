package Code_99_JZOFFER;

public class Code_12 {
    public boolean exist(char[][] board, String word) {
        if(board==null||board.length==0)
            return false;
        if(word==null||word.length()==0)
            return true;
        flag=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(word,board,flag,0,i,j))
                    return true;
            }
        }
        return false;

    }

    boolean[][] flag;
    private int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
    private boolean isValid(int x,int y){
        return x>=0&&x<flag.length&&y>=0&&y<flag[0].length&&!flag[x][y];
    }
    private boolean dfs(String word,char[][] borad,boolean[][] flag,int index,int startx,int starty){
        if(index==word.length()-1){
            return word.charAt(index)==borad[startx][starty];
        }
        if(word.charAt(index)==borad[startx][starty]){
            flag[startx][starty]=true;
            for(int i=0;i<4;i++){
                int newx=startx+d[i][0];
                int newy=starty+d[i][1];
                if(isValid(newx,newy)&&dfs(word,borad,flag,index+1,newx,newy))
                    return true;
            }
            flag[startx][starty]=false;
        }
        return false;
    }
}
