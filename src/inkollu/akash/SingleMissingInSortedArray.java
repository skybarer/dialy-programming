package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 04:32 PM
 */
public class SingleMissingInSortedArray {

    private static int missingInSortedArray(int[] arr) {
        int sum = 0;
        int n = arr[arr.length - 1];
        for (int ele : arr) sum += ele;
        int ap = n * (n + 1) / 2;
        return ap - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        System.out.println("SingleMissingInSortedArray : " + missingInSortedArray(arr));
    }
}
