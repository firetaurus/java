/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author aldus
 */
public class TypeFetching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }

            } //Complete the code
            catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }

}
