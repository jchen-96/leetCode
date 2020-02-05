package Code_99_HOT_100;

public class Code_0647 {
    public int countSubstrings(String s) {
        if(s==null||s.length()<=0)
            return 0;
        if(s.length()==1)
            return 1;
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=centerCount(s,i,i);
            res+=centerCount(s,i,i+1);
        }
        return res;
    }
    private int centerCount(String s,int start,int end){
        int res=0;
        while (start>=0&&end<s.length()&&s.charAt(start--)==s.charAt(end++))
            res++;
        return res;
    }
}
