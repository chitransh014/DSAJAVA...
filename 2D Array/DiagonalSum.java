
public class DiagonalSum {
    public static int Diagonal_Sum(int matrix[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }

        // }
        // return sum;
        // }
        // or

        for (int i = 0; i < matrix.length; i++) {
            // primary
            sum += matrix[i][i];
            // secondary
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 5, 11 },
                { 9, 8, 0, 12 },
                { 10, 11, 15, 3 },
                { 8, 6, 0, 7 }
        };
        System.out.println("sum " + Diagonal_Sum(matrix));

    }
}
