package Code_99_HOT_100;

public class Code_0394 {
    public String decodeString(String s) {
        if(s.length()==1)
            return s;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)==']'||s.charAt(i)=='['))
                break;
            else if(i==s.length())
                return s;
        }
        String res="";
        for(int i=0;i<s.length();){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int j=i;
                while (j<s.length()){
                    if(s.charAt(j)>='0'&&s.charAt(j)<='9')
                        j++;
                    else
                        break;
                }
                String facs=s.substring(i,j);
                int fac=Integer.valueOf(facs);
                int start=j;
                int left=1;
                int right=0;
                i=j;
                i+=1;
                while (i<s.length()&&left!=right){
                    if(s.charAt(i)=='[')
                        left++;
                    if(s.charAt(i)==']')
                        right++;
                    i++;
                }
                String temp=decodeString(s.substring(start+1,i-1));
                for(int t=0;t<fac;t++){
                    res+=temp;
                }
            }else if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                res+=s.charAt(i);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Code_0394 code_0394=new Code_0394();
        System.out.println(code_0394.decodeString("23[a]56[b]89[c]"));
    }
}
