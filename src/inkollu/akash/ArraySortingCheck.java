package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 10:18 AM
 */
public class ArraySortingCheck {

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("ArraySortingCheck : " + isSorted(arr));
    }
}
