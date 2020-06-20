package Code_99_MIanshi;

public class Code_0507 {
    public int exchangeBits(int num) {
        int[] arr=new int[32];
        for(int i=0;i<32;i++){
            if((num&(1<<i))!=0)
                arr[i]=1;
        }
        for(int i=0;i<arr.length;i+=2){
            swap(arr,i,i+1);
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                res|=1<<i;
        }
        return res;
    }

    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
