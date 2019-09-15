package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 12:25 PM
 */
public class MergeSort {

    // merging two sorted arrays
    private static void merge(int[] c, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int na = a.length;
        int nb = b.length;

        while (i < na && j < nb) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < na) {
            c[k++] = a[i++];
        }

        while (j < nb) {
            c[k++] = b[j++];
        }

    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void main(String[] args) {
        int[] arr = {213, 32432, 324, 32, 32, 432, 4, 234, 324324, 324, 43232, 23, 234};

        System.out.println("BubbleSort before sorting : " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("BubbleSort after sorting  : " + Arrays.toString(arr));
    }
}
