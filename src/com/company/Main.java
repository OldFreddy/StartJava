package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][] array;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве \n");
        int n = scan.nextInt();
        System.out.println("Введите количество столбцов в массиве \n");
        int m = scan.nextInt();
        array = new int[n][m];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println("Введите [" + i + "][" + j + "] элемент" );
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " | ");
            }
        }

    }
}
