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
public class GenerateSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum1 = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                sum1 += ((Math.pow(2, j)) * b);
                System.out.printf("%d ", sum1 + a);
            }
            System.out.println();
            sum1 = 0;

        }
        in.close();
        
    }

}
