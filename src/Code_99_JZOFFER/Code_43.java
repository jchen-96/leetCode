package Code_99_JZOFFER;

public class Code_43 {
    public int countDigitOne(int n) {
        int res=0;
        int digit=1;

        int high=n/10;
        int cur=n%10;
        int low=0;
        while (high!=0||cur!=0){
            if(cur==0)
                res+=high*digit;
            else if(cur==1)
                res+=(high*digit+low+1);
            else
                res+=((high+1)*digit);

            low+=cur*digit;
            high=high/10;
            digit*=10;
        }
        return res;
    }

}
