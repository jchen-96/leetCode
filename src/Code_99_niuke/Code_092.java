package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_092 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine().trim());
        String[] s=reader.readLine().trim().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(getRes(arr));
    }
    private static int getRes(int[] arr){
        int jump=0,cur=0,next=0;
        for(int i=0;i<arr.length;i++){
            if(cur<i){
                jump++;
                cur=next;
            }
            next=Math.max(next,i+arr[i]);
        }
        return jump;

    }
}
