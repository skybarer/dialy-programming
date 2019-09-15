package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 15-09-2019
 * @time : 08:24 AM
 */
public class LinearSearch {

    private static int search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        throw new IllegalArgumentException("No element found with the given key");
    }

    public static void main(String[] args) {
        int[] arr = {23, 32312, 3232, 3232432, 32432342, 32432, 43243, 6234, 3776, 34523, 52534, 3452, 2354};
        System.out.println("LinearSearch index found at : " + search(arr, 2354));
    }
}
