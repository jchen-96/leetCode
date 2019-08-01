package Code_00_LeetCode_ShuaTi.Code_04_Recur;
//https://leetcode-cn.com/problems/n-queens/submissions/

//n皇后问题

import java.util.ArrayList;
import java.util.List;

public class Code_0051 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        int[][] mark=new int[n][n];

        List<StringBuilder> item=new ArrayList<>();
        for (int i=0;i<n;i++){
            StringBuilder temp=new StringBuilder();
            for(int j=0;j<n;j++){
                temp=temp.append(".");
            }
            item.add(new StringBuilder(temp));
        }
        generate(0,n,item,result,mark);



        return result;

    }

    private void generate(int index,int n,List<StringBuilder> item,List<List<String>> result,int[][] mark){

//        直接字符串数组还是引用
        if(index==n){
            List<String> tt=new ArrayList<>();
            for(int i=0;i<item.size();i++){
                tt.add(item.get(i).toString());
            }
            result.add(new ArrayList<>(tt));
            return;
        }
        for(int i=0;i<mark.length;i++){
            if(mark[index][i]==0){
                int[][] temp_mark=new int[mark.length][mark.length];
                copy2Array(mark,temp_mark);

                item.get(index).setCharAt(i,'Q');
                put_queen(mark,index,i);

                generate(index+1,n,item,result,mark);

                copy2Array(temp_mark,mark);
                item.get(index).setCharAt(i,'.');

            }
        }

    }

    private void copy2Array(int[][] mark,int[][] temp_mark){
        for(int t_i=0;t_i<mark.length;t_i++){
            for(int t_j=0;t_j<mark.length;t_j++){
                temp_mark[t_i][t_j]=mark[t_i][t_j];
            }
        }
        return;

    }





    private void put_queen(int[][] mark,int x,int y){
        int[] dx=new int[]{-1,1,0,0,-1,-1,1,1};
        int[] dy=new int[]{0,0,-1,1,-1,1,-1,1};
        mark[x][y]=1;
        for(int i=1;i<mark.length;i++){
            for(int j=0;j<8;j++){
                int new_x=x+i*dx[j];
                int new_y=y+i*dy[j];
                if(new_x>=0&&new_x<mark.length&&new_y>=0&&new_y<mark.length){
                    mark[new_x][new_y]=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Code_0051 code_0051=new Code_0051();
        code_0051.solveNQueens(4);
        System.out.println("he");
    }
}
