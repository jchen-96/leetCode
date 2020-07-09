package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_153 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String[] ss=reader.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(ss[i]);
        }
        System.out.println(getLen(arr));

    }
    private static int getLen(int[] arr){
        if(arr==null||arr.length<2)
            return 0;
        int min=arr[arr.length-1];
        int left=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>min){
                left=i;
            }else{
                min=Math.min(min,arr[i]);
            }
        }
        if(left==-1)
            return 0;

        int max=arr[0];
        int right=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max){
                right=i;
            }else{
                max=Math.max(max,arr[i]);
            }
        }
        return right-left+1;

    }
}
