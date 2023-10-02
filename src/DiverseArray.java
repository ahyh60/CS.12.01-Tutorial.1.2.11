public class DiverseArray {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int numRows = arr2D.length;
        int[] rowSums = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            rowSums[i] = arraySum(arr2D[i]);
        }
        return rowSums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] rowSums = rowSums(arr2D);
        int length = rowSums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (rowSums[i] == rowSums[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

