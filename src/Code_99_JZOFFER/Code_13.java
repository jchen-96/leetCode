package Code_99_JZOFFER;

public class Code_13 {
    public int movingCount(int m, int n, int k) {
        if(k==0)
            return 1;
        visited=new boolean[m][n];
        res=0;
        limit=k;
        dfs(visited,0,0);
        return res;
    }

    private int limit;
    private int res;
    private boolean[][] visited;
    private int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
    private boolean isValid(int x,int y){
        return x>=0&&x<visited.length&&y>=0&&y<visited[0].length&&!visited[x][y];
    }
    private boolean limit(int x,int y){
        if(numSum(x)+numSum(y)>limit)
            return false;
        return true;
    }
    private int numSum(int x){
        int temp=0;
        while (x>0){
            temp+=x%10;
            x/=10;
        }
        return temp;
    }
    private void dfs(boolean[][] visited,int x,int y){
        if(visited[x][y])
            return;
        if(isValid(x,y)&&limit(x,y)){
            visited[x][y]=true;
            res++;
            for(int i=0;i<4;i++){
                int newx=x+d[i][0];
                int newy=y+d[i][1];
                if(isValid(newx,newy))
                    dfs(visited,newx,newy);
            }
        }
    }
}
