package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 12:19 PM
 */
public class BubbleSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {213, 32432, 324, 32, 32, 432, 4, 234, 324324, 324, 43232, 23, 234};

        System.out.println("BubbleSort before sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("BubbleSort after sorting  : " + Arrays.toString(arr));
    }
}
