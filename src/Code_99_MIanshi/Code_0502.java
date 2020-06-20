package Code_99_MIanshi;


//worth to read
public class Code_0502 {
    public String printBin(double num) {
        char[] bits=new char[32];
        bits[0]=0;
        bits[1]='.';
        int curr=2;
        int div=2;
        while (num!=0&&curr<bits.length){
            if(num*div>=1){
                bits[curr]='1';
                num-=(1.0/div);
            }else{
                bits[curr]='0';
            }
            div*=2;
            curr++;
        }
        if(num!=0)
            return "ERROR";
        return new String(bits,0,curr);
    }
}
