package Code_99_MIanshi;

public class Code_0101 {
    public boolean isUnique(String astr) {
        int mark=0;
        for(int i=0;i<astr.length();i++){
            int v=astr.charAt(i)-'a';
            if((mark&(1<<v))!=0)
                return false;
            else
                mark|=(1<<v);
        }
        return true;
    }
}
