package inkollu.akash;

/**
 * @author : akashdhar
 */
public class HeadRecursion {

    // process executes after recursive call
    private static void function(int n) {
        if (n > 0) {
            function(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        function(x);
    }
}
