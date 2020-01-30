package Code_99_HOT_100;

//暴力解法，下次尝试动态规划

//https://leetcode-cn.com/problems/regular-expression-matching/
public class Code_0010 {
    public boolean isMatch(String s, String p) {
        if(p==null||p.length()==0)
            return s==null||s.length()==0;
        boolean first=(s.length()!=0)&&(p.charAt(0)==s.charAt(0)||p.charAt(0)=='.');

        if((p.length()>=2)&&(p.charAt(1)=='*')){
            return isMatch(s,p.substring(2))||first&&isMatch(s.substring(1),p);
        }else
            return first&&isMatch(s.substring(1),p.substring(1));
    }

    public static void main(String[] args) {
        Code_0010 code_0010=new Code_0010();
        code_0010.isMatch("aa","a");
    }
}
