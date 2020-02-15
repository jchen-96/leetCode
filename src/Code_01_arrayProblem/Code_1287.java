package Code_01_arrayProblem;

public class Code_1287 {
        public int findSpecialInteger(int[] arr) {
            int threshold = arr.length / 4;
            for (int i = 0; i < arr.length&&i+threshold<arr.length; i++) {
                if (arr[i + threshold] == arr[i]) {
                    return arr[i];
                }
            }
            return 0;
        }
}
