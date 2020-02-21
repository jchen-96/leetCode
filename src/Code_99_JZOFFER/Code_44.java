package Code_99_JZOFFER;


//效率有点低，下次复习看
public class Code_44 {
    public int findNthDigit(int n) {
        if(n<10)
            return n;
        int count=0;
        while (n>((count+1)*9*Math.pow(10,count))){
            n-=((count+1)*9*Math.pow(10,count));
            count++;
        }
        int start=(int)Math.pow(10,count);
        count++;
        while (n>count){
            start++;
            n-=count;
        }
        return String.valueOf(start).charAt(n-1)-'0';

    }

    public static void main(String[] args) {
        Code_44 code_44=new Code_44();
        code_44.findNthDigit(13);
    }
}
