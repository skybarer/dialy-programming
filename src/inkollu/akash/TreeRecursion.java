package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 17-09-2019
 * @time : 04:19 AM
 */
public class TreeRecursion {

    static int count = 0;
    private static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
            fun(n - 1);
        }
        count++;
    }

    public static void main(String[] args) {
        fun(3);
        // fifteen calls are created O(2^n)
        System.out.println("count : "+count);
    }
}
