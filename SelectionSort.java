public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[min_idx] > arr[j])
                    min_idx = j;
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
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