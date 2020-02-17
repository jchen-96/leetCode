package Code_99_JZOFFER;


//下次使用搜索的思路做一下
public class Code_17 {
    public int[] printNumbers(int n) {
        int m=(int)Math.pow(10,n);
        int[] res=new int[m-1];
        for(int i=1;i<m;i++){
            res[i-1]=i;
        }
        return res;
    }
}
