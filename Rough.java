import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int arr[], int l, int r) {
        if (l >= r)
            return;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

}
