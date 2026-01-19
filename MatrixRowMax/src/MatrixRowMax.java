public class MatrixRowMax {

    public static void main(String[] args) {
        System.out.println("Задание 3 - Максимальный элемент каждой строки");
        System.out.println("----------------------------------------\n");

        // Матрица 4x5 (та же, что и в предыдущем примере)
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  0,  8, -1, 10},
                {-2, 3,  4,  5,  0},
                {7,  1, -3,  2,  9}
        };

        System.out.println("Матрица:");
        printMatrix(matrix);

        System.out.println("Максимум в каждой строке:");
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Строка " + i + ": " + max);
        }
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}