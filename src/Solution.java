class Solution{
    public int getValue(String exp){
        if(isNum(exp))
            return Integer.parseInt(exp);
        int i=0;
        int j=0;
        if (exp.charAt(j)<'0'||exp.charAt(j)>'9'){
            char c=exp.charAt(j);
            if(c=='+'){
                return Integer.parseInt(exp.substring(i,j))+getValue(exp.substring(j+1));
            }else if(c=='-'){
                return Integer.parseInt(exp.substring(i,j))-getValue(exp.substring(j+1));
            }else if(c=='/'){

            }else{

            }
        }else{
            j++;
        }
        return 0;
    }
    private boolean isNum(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9')
                return false;
        }
        return true;
    }
}