public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("Сортировка выбором");
        System.out.println("До сортировки:");
        printArray(arr);

        // Сортировка выбором
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("После сортировки:");
        printArray(arr);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}