package Code_99_JZOFFER;

public class Code_15 {
    public int hammingWeight(int n) {
        int res=0;
        int i=1;
        for(int k=0;k<32;k++){
            if((i&n)!=0)
                res++;
            i=i<<1;
        }
        return res;
    }
}
