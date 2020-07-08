package Code_99_Basic.repeat.sort;

public class Util {
    public static boolean isSorted(int[] arr){

        for( int i = 0 ; i < arr.length - 1 ; i ++ )
            if( arr[i]>arr[i+1] )
                return false;
        return true;
    }

    public static int[] generateRandomArray() {

        int n=10000;
        int rangeL=-100;
        int rangeR=10000000;

        assert rangeL <= rangeR;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }
}
