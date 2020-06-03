package Code_99_MIanshi;

public class Code_0105 {
    public boolean oneEditAway(String first, String second) {
        if(first.equals(second))
            return true;
        if(Math.abs(first.length()-second.length())>=2)
            return false;


    }
}
