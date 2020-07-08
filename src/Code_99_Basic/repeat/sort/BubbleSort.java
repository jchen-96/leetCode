package Code_99_Basic.repeat.sort;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=Util.generateRandomArray();
        bubbleSort(arr);
        System.out.println(Util.isSorted(arr));
    }
    private static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
