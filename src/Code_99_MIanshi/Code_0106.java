package Code_99_MIanshi;

public class Code_0106 {
    public String compressString(String S) {
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end=0;
        while (end<S.length()){
            while (end<S.length()&&S.charAt(end)== S.charAt(start))
                end++;
            sb.append(S.charAt(start)).append(end-start);
            start=end;
        }
        return S.length()>sb.length()?new String(sb):S;
    }
}
