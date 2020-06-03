package Code_99_MIanshi;


//no need to read
public class Code_0109 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<s1.length();i++){
            sb=sb.append(s1.substring(i,s1.length())).append(s1.substring(0,i));
            if(new String(sb).equals(s2))
                return true;
            sb=new StringBuilder();
        }

        return false;
    }
}
