package inkollu.akash;

import java.util.Arrays;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 08:43 AM
 */
public class BinarySearch {

    private static int rBinSearch(int[] arr, int l, int r, int key) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key) return rBinSearch(arr, l, mid - 1, key);
            return rBinSearch(arr, mid + 1, r, key);
        }
        return -1;
    }

    private static int binSearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key) r = mid - 1;
            if (arr[mid] < key) l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 32312, 3232, 3232432, 32432342, 32432, 43243, 6234, 3776, 34523, 52534, 3452, 2354};
        Arrays.sort(arr);
        System.out.println("BinarySearch : " + rBinSearch(arr, 0, arr.length - 1, 52534));
        System.out.println("BinarySearch : " + binSearch(arr, 0, arr.length - 1, 52534));
    }
}
