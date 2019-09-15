package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 11:07 AM
 */
public class MergeSortedArrays {

    private static void merge(int[] c, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;

        int na = a.length;
        int nb = b.length;

        while (i < na && j < nb) {
            if (a[i] < b[j]) {
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

    public static void main(String[] args) {
        int[] arr1 = {3, 8, 16, 20, 25};
        int[] arr2 = {4, 10, 12, 22, 23};
        int[] result = new int[arr1.length + arr2.length];
        merge(result, arr1, arr2);
        System.out.println("MergeSortedArrays : " + Arrays.toString(result));
    }
}
