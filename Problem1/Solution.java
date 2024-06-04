package Problem1;

import java.util.Arrays;

public class Solution {

    // using new array
    public static void rotateSolution1(int[] arr, int n, int k) {
        if (n <= 0 || k < 0)
            return;
        if (k > n)
            k = k % n;
        int res[] = new int[n];
        for (int i = 0; i < k; i++) {
            res[i] = arr[n - k + i];
        }
        int j = 0;
        for (int i = k; i < n; i++) {
            res[i] = arr[j];
            j++;
        }
        print(res);
        // System.arraycopy(res, 0, arr, 0, n);// copy back to original array
    }

    // using bubble rotate
    public static void rotateSolution2(int[] arr, int n, int k) {
        if (n <= 0 || k < 0)
            throw new IllegalArgumentException();

        for (int i = 0; i < k; i++) {
            for (int j = n - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        print(arr);
    }

    public static void rotateSolution3(int[] arr, int n, int k) {
        if (n <= 0 || k < 0)
            throw new IllegalArgumentException();

        int a = n - k;
        reverse(arr, 0, a - 1);
        reverse(arr, a, n - 1);
        reverse(arr, 0, n - 1);
        print(arr);
    }

    public static void reverse(int arr[], int l, int r) {
        if (l == r)
            return;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    // test Methods
    public static void print(int[] arr) {
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 7;
        int k = 3;
        rotateSolution1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, n, k);
        rotateSolution2(new int[] { 1, 2, 3, 4, 5, 6, 7 }, n, k);
        rotateSolution3(new int[] { 1, 2, 3, 4, 5, 6, 7 }, n, k);
    }
}