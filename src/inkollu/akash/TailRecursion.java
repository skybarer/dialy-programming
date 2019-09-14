package inkollu.akash;

/**
 * @author : akashdhar
 * @date : 14-09-2019
 * @time : 06:19 PM
 */
public class TailRecursion {
    // process executes before recursive call
    private static void function(int n) {
        if (n > 0) {
            System.out.println(n);
            function(n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        function(x);
    }
}
