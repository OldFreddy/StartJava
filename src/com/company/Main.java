package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextFloat();
        System.out.println("Enter second num");
        second = num.nextFloat();
        result = first + second;
        System.out.println("Result is: " + result);
    }
}
