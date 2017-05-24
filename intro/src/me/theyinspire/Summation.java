package me.theyinspire;

import java.util.Scanner;

/**
 * @author Zohreh Sadeghi (zsadeghi@email.com)
 * @since 1.0 (5/22/17, 10:44 PM)
 */
public class Summation {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        sum = x + y;
        System.out.print(sum);
    }

}
