package weekContest.week130;


// 可以看一下
//负二进制转换,将十进制数转换成负二进制

import java.util.Stack;

public class Code_1017 {
    public String baseNeg2(int N) {
        Stack<Integer> s=new Stack<>();

        if(N==0)
            return "0";
        while (N!=0){
            int a=Math.abs(N%(-2));
            s.push(a);
            N=(N-a)/(-2);
        }
        String res="";
        while (!s.empty()){
        res+=Integer.toString(s.pop());
        }
        return res;
    }
}
