package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_102 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(reader.readLine());
        while (count>0){
            String[] data=reader.readLine().split(" ");
            int n=Integer.parseInt(data[0]);
            int p=Integer.parseInt(data[1]);
            int m=Integer.parseInt(data[2]);
            if(n>2)
                System.out.println(2*n-3);
            else
                System.out.println(n-1);
            count--;
        }
        reader.close();
    }
}
