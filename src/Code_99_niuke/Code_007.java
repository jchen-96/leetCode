package Code_99_niuke;
import java.util.*;



public class Code_007{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        for(int i=n-1;i>=0;i--){
            stack.push(Integer.parseInt(s.split(" ")[i]));
        }
        reverse(stack);
        for(int i=0;i<n-1;i++){
            System.out.print(stack.pop()+" ");
        }
        System.out.println(stack.pop());

    }
    private static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int i=getLast(stack);
        reverse(stack);
        stack.push(i);
    }
    private static int getLast(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty())
            return result;
        else{
            int i=getLast(stack);
            stack.push(result);
            return i;
        }
    }

}