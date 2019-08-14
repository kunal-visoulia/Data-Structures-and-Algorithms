public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > val) {
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 6, 3, 5, 0 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        sort(arr);
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
