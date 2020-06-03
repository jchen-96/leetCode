package Code_99_MIanshi;


//no need to read
public class Code_0105 {
    public boolean oneEditAway(String first, String second) {
        if(first.equals(second))
            return true;
        if(Math.abs(first.length()-second.length())>=2)
            return false;

        int remain=1;
        if(first.length()==second.length()){
            for(int i=0;i<first.length();i++){
                if(first.charAt(i)!=second.charAt(i)){
                    if(remain==1)
                        remain--;
                    else
                        return false;
                }
            }
            return true;
        }

        //保证first.length>second.length
        if(first.length()<second.length()){
            String t=first;
            first=second;
            second=t;
        }
        int firsti=0;
        int secondi=0;
        while (firsti<first.length()){
            if(secondi<second.length()&&first.charAt(firsti)==second.charAt(secondi)){
                firsti++;
                secondi++;
            }else{
                if(remain==0)
                    return false;
                else
                    remain--;
                firsti++;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new Code_0105().oneEditAway("","a"));
    }
}
