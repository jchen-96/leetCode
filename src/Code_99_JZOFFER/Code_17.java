package Code_99_JZOFFER;


import java.util.ArrayList;
import java.util.List;

//下次使用搜索的思路做一下
public class Code_17 {
    List<String> res=new ArrayList<>();
    public String[] printNumbers(int n) {
        dfs("",n);
        String[] ss=new String[res.size()];
        return res.toArray(ss);
    }
    private void dfs(String cur,int n){
        if(cur.length()==n){
            res.add(cur);
            return;
        }
        for(int i=0;i<10;i++)
            dfs(cur+i,n);
    }

    public static void main(String[] args) {
        String[] ss=new Code_17().printNumbers(2);
        for(String s:ss)
            System.out.println(s);
    }
}
