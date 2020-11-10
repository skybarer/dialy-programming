package inkollu.akash;

import java.util.Arrays;

public class SelectionSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {213, 32432, 324, 32, 32, 432, 4, 234, 324324, 324, 43232, 23, 234};
        System.out.println("SelectionSort before sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("SelectionSort after sorting  : " + Arrays.toString(arr));
    }
}
