package Code_99_JZOFFER;

public class Code_50 {
    public char firstUniqChar(String s) {
        if(s==null||s.length()<=0)
            return ' ';
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1)
                return s.charAt(i);
        }
        return ' ';
    }
}
