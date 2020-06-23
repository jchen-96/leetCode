package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_048 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int len1=Integer.parseInt(reader.readLine());
        String[] s1=reader.readLine().trim().split(" ");
        int[] arr1=new int[len1];
        for(int i=0;i<len1;i++){
           arr1[i]=Integer.parseInt(s1[i]);
        }
        int len2=Integer.parseInt(reader.readLine());
        s1=reader.readLine().trim().split(" ");
        int[] arr2=new int[len2];
        for(int i=0;i<len2;i++){
            arr2[i]=Integer.parseInt(s1[i]);
        }
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while (i<len1&&j<len2){
            if(arr1[i]==arr2[j]){
                sb.append(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(sb);

    }
}
