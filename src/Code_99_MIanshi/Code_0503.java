package Code_99_MIanshi;

public class Code_0503 {
    public int reverseBits(int num) {
        int[] arr=new int[32];
        for(int i=0;i<32;i++){
            if((num&(1<<i))!=0)
                arr[i]=1;
        }
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int left=i-1;
                int right=i+1;
                while (left>=0&&arr[left]==1)
                    left--;
                while (right<arr.length&&arr[right]==1)
                    right++;
                res=Math.max(res,right-left-1);
            }
        }
        return res;

    }
}
