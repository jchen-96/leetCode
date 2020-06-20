package Code_99_MIanshi;

//no need to read
public class Code_0506 {
    public int convertInteger(int A, int B) {
        int res=A^B;
        int count=0;
        for(int i=0;i<32;i++){
            if((res&1<<i)!=0)
                count++;
        }
        return count;
    }
}
