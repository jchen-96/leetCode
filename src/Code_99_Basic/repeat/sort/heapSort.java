package Code_99_Basic.repeat.sort;


//堆排序，其实也简单
public class heapSort {

    public static void main(String[] args) {
        int[] arr=Util.generateRandomArray();
        heapSrot(arr);
        System.out.println(Util.isSorted(arr));
    }

    private static void heapSrot(int[] arr){
        int size=arr.length;
        for(int i=(size-2)/2;i>=0;i--){
            shiftDown2(arr,size,i);
        }
        for(int i=size-1;i>=0;i--){
            swap(arr,i,0);
            shiftDown2(arr,i,0);
        }
    }

    private static void shiftDown(int[] arr,int  size,int i){
        while (i*2+1<size){
            int j=i;
            j=arr[i*2+1]>arr[i]?i*2+1:i;
            if(i*2+2<size&&arr[i*2+2]>arr[j])
                j=i*2+2;
            if(j!=i) {
                swap(arr, i, j);
                i=j;
            }else{
                break;
            }
        }
    }

    private static void shiftDown2(int[] heap,int n,int i){
        while (i*2+1<n){
            int j=heap[i*2+1]>heap[i]?i*2+1:i;
            if(i*2+2<n){
                if(heap[i*2+2]>heap[j])
                    j=i*2+2;
            }
            if(i==j)
                return;
            swap(heap,i,j);
            i=j;
        }

    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
