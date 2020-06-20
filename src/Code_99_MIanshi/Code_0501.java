package Code_99_MIanshi;

public class Code_0501 {
    public int insertBits(int N, int M, int i, int j) {
        for (int dis = i; dis < j + 1; dis++) {
            N = N & Integer.rotateLeft(~1, dis);
        }
        return N | M << i;
    }

    public static void main(String[] args) {
        System.out.println(PizzaStatus.DELIVERED.getClass());
    }
}

enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;
}
