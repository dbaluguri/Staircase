package com.hackerrank.learn;

import java.util.Scanner;

public class Staircase {

    private static final String SPACE = " ";
    private static final String HASH = "#";

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(SPACE);
            }
            System.out.println(repeat(HASH, i));
        }

    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
