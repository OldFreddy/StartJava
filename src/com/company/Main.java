package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 10, 1, 5, 17, 15, 13, 4, 6, 2, 8, 3, 16, 7, 19, 46, 87,  24, 51};
        int temp = 0;
        boolean finish = false;
        Scanner scan = new Scanner(System.in);

        printArray(array);

        while (finish == false){
            finish = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    temp = array[i];
                    array[i]=array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
            printArray(array);
        }

        binnarySearch(array, 10 );



    }
    public static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void binnarySearch(int[] arr, int elementToSearch) {

        int lowElement = 0;
        int highElement = arr.length - 1;
        int middleElement;

        while(lowElement <= highElement){
            middleElement = (lowElement + highElement) / 2;

            if (arr[middleElement] == elementToSearch){
                System.out.println("\n Элемент " + elementToSearch +" найден под индексом " + middleElement );
                break;
            }
            else if (arr[middleElement] > elementToSearch){
                highElement = middleElement;

            }
            else {
                lowElement = middleElement;
            }


        }


    }
}
