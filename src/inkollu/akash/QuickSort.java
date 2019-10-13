package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 12-10-2019
 * @time : 07:49 PM
 */
public class QuickSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int partitionIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, end);
        return partitionIndex;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 45, 3, 32, 432, 324324, 687, 553443, 234324};
        System.out.println("QuickSort" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickSort" + Arrays.toString(arr));
    }
}
