package Code_99_JZOFFER;

public class Code_58_1 {
    public String reverseWords(String s) {
        s=s.trim();
        String[] t=s.split("\\s+");
        String res="";
        for(int i=t.length-1;i>=0;i--){
            if(i==0) {
                res += t[i];
                continue;
            }
            res+=t[i];
            res+=" ";
        }
        return res;
    }
}
