package Code_99_JZOFFER;

public class Code_65 {
    public int add(int a, int b) {
        while (b!=0){
            int ans=(a^b);
            b=(a&b)<<1;
            a=ans;
        }
        return a;
    }
}
