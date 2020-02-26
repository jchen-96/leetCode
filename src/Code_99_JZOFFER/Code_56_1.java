package Code_99_JZOFFER;

public class Code_56_1 {
    public int[] singleNumbers(int[] nums) {
        int[] res=new int[2];
        int sum=0;
        for(int i:nums){
            sum^=i;
        }
//        一个数与自己的相反数相与，得到的数，只有一个一，且这个一位于原数的最后一个一的位置
        int index=sum&(-sum);
        int a=0;
        int b=0;
        for(int t:nums){
            if((t&index)==0)
                a^=t;
            else
                b^=t;
        }
        res[0]=a;
        res[1]=b;
        return res;

    }
}
