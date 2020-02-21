package Code_99_JZOFFER;

//归并排序思路没问题，逆序对有点问题
public class Code_51 {
    private int count = 0;

    public int reversePairs(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        mergeSort(nums,0,nums.length-1);
        return count;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l == r)
            return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int li=l;
        int ri = mid + 1;
        int k = 0;
        while (k < temp.length) {
            if (li > mid) {
                temp[k++] = arr[ri++];
            } else if (ri > r) {
                temp[k++] = arr[li++];
            } else {
                if(arr[li]>arr[ri]){
                    temp[k++]=arr[ri];
                    count+=(mid-li+1);
                    ri++;
                }else{
                    temp[k++]=arr[li];
                    li++;
                }
            }
        }
        for(int i =l;i<=r;i++){
            arr[i]=temp[i-l];
        }
    }

    public static void main(String[] args) {
        Code_51 code_51=new Code_51();
        code_51.reversePairs(new int[]{2,1});
    }

}
