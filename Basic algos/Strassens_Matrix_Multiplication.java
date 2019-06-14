public class Strassens_Matrix_Multiplication {

    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A[0].length;
        int[][] result = new int[n][n];

    }

    public static void main(String[] args) {
        // int[] a =new int[5];
        // int[] a ={1,2};
        // System.out.println(a[0]);

        // int[][] arr =new int[5][5];
        int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };// p x q
        int[][] arr2 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };// q x r

        // Naive Methd O(n^3)
        // int p = 3, q = 3, r = 3;
        // int[][] result = new int[p][r];
        // for (int i = 0; i < p; i++) {
        // for (int j = 0; j < r; j++) {
        // result[i][j] = 0;
        // for (int k = 0; k < q; k++) {
        // result[i][j] += arr1[i][k] * arr2[k][j];
        // }

        // }
        // }
        // for (int i = 0; i < p; i++) {
        // for (int j = 0; j < r; j++) {
        // System.out.println(result[i][j]);
        // }
        // }

        // Strassen's
        // Strassen’s Matrix multiplication can be performed only on square matrices
        // where n is a power of 2. Order of both of the matrices are n × n.
        int[][] result=multiply(arr1, arr2);
        for (int i = 0; i < p; i++) {
        for (int j = 0; j < r; j++) {
        System.out.println(result[i][j]);
        }
        }
    }
}