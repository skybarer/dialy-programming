package inkollu.akash;

import java.util.Scanner;

/**
 * @author : akashdhar
 * @date : 07-09-2019
 * @time : 01:17 PM
 */
public class SumOFDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberSum = 0;

        while (number > 0) {
            numberSum += number % 10;
            number = number / 10;
        }

        System.out.println("Sum of digits of a number: " + numberSum);
    }

}
