public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("Сортировка слиянием");
        System.out.println("До сортировки:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("После сортировки:");
        printArray(arr);
    }

    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = a[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}