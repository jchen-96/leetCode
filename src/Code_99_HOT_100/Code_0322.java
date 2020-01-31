package Code_99_HOT_100;

import java.util.Arrays;


//暴力搜索的基础上加上一个备忘录
public class Code_0322 {


    private int[] mem;


    public int coinChange(int[] coins, int amount) {
        mem=new int[amount+1];
        for(int i=1;i<mem.length;i++)
            mem[i]=-1;
        for(int c:coins){
            if(c<=amount)
                mem[c]=1;
        }
        sub(coins,amount);
        return mem[amount]==-2?-1:mem[amount];
    }

    private int sub(int[] coins,int amount){
        if(mem[amount]!=-1)
            return mem[amount];

        int res=Integer.MAX_VALUE;
        for(int c:coins){
            if(amount-c<0)
                continue;
            int sub=sub(coins,amount-c);
            if(sub==-2) {
                continue;
            }
            res=Math.min(res,sub+1);
        }
        if(res==Integer.MAX_VALUE)
            mem[amount]=-2;
        else
            mem[amount]=res;
        return mem[amount];
    }

    public static void main(String[] args) {
        Code_0322 code_0322=new Code_0322();
        code_0322.coinChange(new int[]{1,2,5},11);
    }
}
