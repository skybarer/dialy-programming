package inkollu.akash;

import java.util.Arrays;

public class InsertionSort {

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {213, 32432, 324, 32, 32, 432, 4, 234, 324324, 324, 43232, 23, 234};
        System.out.println("InsertionSort before sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("InsertionSort after sorting  : " + Arrays.toString(arr));
    }
}
