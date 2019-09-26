package Code_99_LuanShua;


//no need to read
import java.util.ArrayList;
import java.util.List;

public class Code_0821 {
    public int[] shortestToChar(String S, char C) {
        char[] cc=S.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<cc.length;i++){
            if(cc[i]==C)
                list.add(i);
        }
        int[] arr=new int[S.length()];
        for (int i=0;i<arr.length;i++){
            if(cc[i]!=C){
                int mind=S.length();
                for(int t:list){
                    mind=Math.min(mind,Math.abs(i-t));
                }
                arr[i]=mind;
            }
        }
        return arr;
    }
}
