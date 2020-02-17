package Code_99_JZOFFER;

import java.math.BigInteger;

public class Code_14_2 {
    public int cuttingRope(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int count=n/3;
        long res=1;
        int b=n%3;
        if(b==1){
            count--;
            res=4;
        }else if(b==2)
            res*=2;
        for(int i=0;i<count;i++){
            res*=3;
            res%=1000000007;
        }
        return (int)res;
    }
}
