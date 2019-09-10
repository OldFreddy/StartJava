package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] array = {{1,2,3,6},{4,5,6},{7,8,9}};
        array[0][0] = 'C';
        System.out.println(array[2].length);
        System.out.println(array[0][0]);
    }
}
