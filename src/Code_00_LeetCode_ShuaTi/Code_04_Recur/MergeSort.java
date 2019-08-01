package Code_00_LeetCode_ShuaTi.Code_04_Recur;

public class MergeSort {
    public void mergeSort(int arr[]){
        mergeSort(arr,0,arr.length-1);
        System.out.println("hello");
    }
    private void mergeSort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    private void merge(int arr[],int l,int mid,int right){
        int[] aux=new int[right-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while (k<aux.length){
            if(i<=mid&&j<=right){
                if(arr[i]<arr[j]){
                    aux[k++]=arr[i++];
                }else{
                    aux[k++]=arr[j++];
                }
            }else{
                if(i>mid){
                    aux[k++]=arr[j++];
                    continue;
                }
                if(j>right){
                    aux[k++]=arr[i++];
                    continue;
                }
            }
        }
        for(int t=l;t<=right;t++){
            arr[t]=aux[t-l];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        mergeSort.mergeSort(new int[]{9,7,3,5,100,-1,2,8,9});
    }
}
