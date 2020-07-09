package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_152 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        s=reader.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int[] res=getKmin(arr,k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
    public static int[] getKmin(int[] arr,int k){
        int[] heap=new int[k];
        for(int i=0;i<k;i++){
            heap[i]=arr[i];
        }
        for(int i=0;i<heap.length/2;i++){
            shiftDown(heap,i);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<heap[0]) {
                heap[0]=arr[i];
                shiftDown(heap,0);
            }
        }
        return heap;

    }
    private static void shiftDown(int[] heap,int i){
        while (i*2+1<heap.length){
            int j=heap[i*2+1]>heap[i]?i*2+1:i;
            if(i*2+2<heap.length){
                if(heap[i*2+1]>heap[j])
                    j=i*2+1;
            }
            if(i==j)
                return;
            swap(heap,i,j);
            i=j;
        }
    }
    private static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
