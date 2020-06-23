package Code_99_LuanShua;

import java.util.HashSet;
import java.util.Set;

public class Code_0202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    private int getNext(int n){
        int totalNum=0;
        while (n>0){
            int d=n%10;
            n/=10;
            totalNum+=d*d;
        }
        return totalNum;
    }

}
