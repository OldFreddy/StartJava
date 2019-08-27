package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = true;
        System.out.println("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51? true : false; // Если first = 51, то isTrue = first

        if (first >= second && isTrue) {
            System.out.print("Num is 10");
            System.out.print("\n");
        } else if (first == 45) {
            System.out.print("Num is equal 45");
        }
        else {
            System.out.print("Num is lower than " + second);
        }
    }
}
