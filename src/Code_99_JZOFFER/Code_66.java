package Code_99_JZOFFER;

public class Code_66 {
    public int[] constructArr(int[] a) {
        if(a==null||a.length<=1)
            return a;
        int[] res=new int[a.length];
        int[] left=new int[a.length];
        int[] right=new int[a.length];
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*a[i-1];
        }
        right[right.length-1]=1;
        for(int i=right.length-2;i>=0;i--){
            right[i]=right[i+1]*a[i+1];
        }
        for(int i=0;i<res.length;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}
