package Code_99_Basic.repeat.sort;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] arr=Util.generateRandomArray();
        insertSort(arr);
        System.out.println(Util.isSorted(arr));
    }

    private static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
