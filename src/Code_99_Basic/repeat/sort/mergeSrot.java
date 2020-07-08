package Code_99_Basic.repeat.sort;

import java.util.Arrays;


//归并排序
public class mergeSrot {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 4, 5, 6, -1, 9};
//        int[] arr=Util.generateRandomArray();
        mergeSrot(arr, 0, arr.length - 1);
        System.out.println(Util.isSorted(arr));
    }


    private static void mergeSrot(int[] arr, int l, int r) {
        if (r <= l)
            return;
        int mid = (r - l)/2 + l ;
        mergeSrot(arr, l, mid);
        mergeSrot(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] aux = Arrays.copyOfRange(arr, l, r + 1);
        int i = 0;
        int j = mid - l+1;
        int k = 0;
        while (i <= mid - l || j <= r - l) {
            if (i > mid - l) {
                arr[l + k] = aux[j];
                j++;
            } else if (j > r - l) {
                arr[l + k] = aux[i];
                i++;
            } else if (aux[i] < aux[j]) {
                arr[l + k] = aux[i];
                i++;
            } else {
                arr[l + k] = aux[j];
                j++;
            }
            k++;
        }
    }
}
