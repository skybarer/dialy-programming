package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 10:00 AM
 */
public class ArrayReverse {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr) {
        int n = arr.length - 1;
        int j = n;
        for (int i = 0; i <= n / 2; i++) {
            swap(arr, i, n--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array Reverse Before: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array Reverse After : " + Arrays.toString(arr));
    }
}
