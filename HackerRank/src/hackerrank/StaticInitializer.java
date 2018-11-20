/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author aldus
 */
public class StaticInitializer {

    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag = true;

    static {
        if (B <= 0 || H <= 0) {
            flag = false;
            String error = "java.lang.Exception: Breadth and height must be positive";
            System.out.printf("%s", error);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

