package Code_99_JZOFFER;

public class Code_05 {
    public String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        Code_05 code_05=new Code_05();
        System.out.println(code_05.replaceSpace("we are happy"));
    }
}
