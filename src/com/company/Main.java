package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        int multi = a * b * c;
        System.out.println("5 + 7 + 8 = " + sum);
        System.out.println("5 * 7 * 8 = " + multi);
        System.out.println("(5 + 7 + 8) / 3 = " + sum / 3d);

   }
}
