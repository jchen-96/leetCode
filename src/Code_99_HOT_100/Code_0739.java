package Code_99_HOT_100;

public class Code_0739 {
    public int[] dailyTemperatures(int[] T) {
        int[] res=new int[T.length];
        for(int i=T.length-2;i>=0;i--){
            if(T[i]<T[i+1])
                res[i]=1;
            else{
                int j=i+1;
                while (j<T.length&&res[j]!=0&&T[j]<=T[i]){
                    j+=res[j];
                }
                if(j<T.length&&T[j]>T[i])
                    res[i]=j-i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Code_0739 code_0739=new Code_0739();
        code_0739.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
}
