class Main {

    public static void main(String[] args) {
        System.out.println("Задание 2 - Произведение элементов каждого столбца");
        System.out.println("----------------------------------------\n");

        // Матрица 4x5 (пример)
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  0,  8, -1, 10},
                {-2, 3,  4,  5,  0},
                {7,  1, -3,  2,  9}
        };

        System.out.println("Матрица:");
        printMatrix(matrix);

        System.out.print("Произведение по столбцам: ");
        for (int j = 0; j < matrix[0].length; j++) {
            int proizv = 1;
            for (int i = 0; i < matrix.length; i++) {
                proizv = proizv * matrix[i][j];
            }
            System.out.print(proizv + "   ");
        }
        System.out.println();
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