package Code_01_arrayProblem;


//https://leetcode-cn.com/problems/spiral-matrix-ii/


//too easy

public class Code_0059 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int count = 1;

        for (int i = 0; i <= n / 2; i++) {
            int startX = i;
            int startY = i;
            int endX = n - 1 - i;
            int endY = n - 1 - i;

            for (int j = startX; j <= endX; j++) {
                arr[startY][j] = count++;
            }

            for (int j = startY + 1; j < endY; j++) {
                arr[j][endX] = count++;
            }

            if (startY != endY) {
                for (int j = endX; j >= startX; j--) {
                    arr[endY][j] = count++;
                }
            }
            if (startX != endX) {
                for (int j = endY - 1; j > startY; j--) {
                    arr[j][startX] = count++;
                }
            }


        }

        return arr;
    }

    public static void main(String[] args) {
        Code_0059 code_0059 = new Code_0059();
        int[][] arr = code_0059.generateMatrix(3);
        System.out.println("test");
    }
}
