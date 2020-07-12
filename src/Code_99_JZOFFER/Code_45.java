package Code_99_JZOFFER;

import java.util.Arrays;
import java.util.Comparator;

public class Code_45 {
    public String minNumber(int[] nums) {
        String[] ss=new String[nums.length];
        for(int i=0;i<ss.length;i++){
            ss[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ss, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:ss)
            sb.append(s);
        String s=new String(sb);

        //这里是用来去掉前缀0
        char[] c=s.toCharArray();
        int index=0;
        while (c[index]=='0')
            index++;
        return s.substring(index);
    }
}
