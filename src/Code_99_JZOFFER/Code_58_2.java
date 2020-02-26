package Code_99_JZOFFER;

public class Code_58_2 {
    public String reverseLeftWords(String s, int n) {
        String temp=s.substring(0,n);
        String t2=s.substring(n);
        return t2+temp;
    }
}
