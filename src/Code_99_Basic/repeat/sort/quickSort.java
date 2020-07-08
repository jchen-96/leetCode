package Code_99_Basic.repeat.sort;

//三路快排
public class quickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,4,5,6,-1,9};
//        int[] arr=Util.generateRandomArray();
        quickSort(arr,0,arr.length-1);
        System.out.println(Util.isSorted(arr));
    }


    public static void quickSort(int[] arr,int l,int r){
        if(l>=r)
            return;
        swap(arr,l,(int)(Math.random()*(r-l+1)+l));
        int base=arr[l];

        int lt=l;
        int rt=r+1;
        int i=l+1;
        while (i<rt){
            if(arr[i]<base){
                swap(arr,lt+1,i);
                i++;
                lt++;
            }else if(arr[i]>base){
                swap(arr,rt-1,i);
                rt--;
            }else{
                i++;
            }
        }
        swap(arr,l,lt);
        quickSort(arr,l,lt-1);
        quickSort(arr,rt,r);

    }

    private static void  swap(int[] arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
