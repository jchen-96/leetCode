package Code_99_Basic.repeat.sort;

public class selectSort {

    public static void main(String[] args) {
        int[] arr=Util.generateRandomArray();
        selectSort(arr);
        System.out.println(Util.isSorted(arr));
    }


    private static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndx])
                    minIndx=j;
            }
            swap(arr,minIndx,i);
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
