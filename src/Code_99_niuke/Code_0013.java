package Code_99_niuke;

import java.util.*;
public class Code_0013{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();

        Stack<Integer> stack=new Stack();
        for(int i=n-1;i>=0;i--){
            stack.push(Integer.parseInt(s.split(" ")[i]));
        }
        sort(stack);
        for(int i=0;i<n-1;i++){
            System.out.print(stack.pop()+" ");
        }
        System.out.println(stack.pop());

    }
    public static void sort(Stack<Integer> stack){
        Stack<Integer> help=new Stack<Integer>();
        while(!stack.isEmpty()){
            int cur=stack.pop();
            while(!help.isEmpty()&&cur>help.peek())
                stack.push(help.pop());
            help.push(cur);
        }
        while(!help.isEmpty())
            stack.push(help.pop());
    }
}
