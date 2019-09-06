package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        System.out.println("\n Введите искомое число ");
        int searchingElement = scan.nextInt();
        binnarySearch(array, searchingElement );



    }
    public static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void binnarySearch(int[] arr, int elementToSearch) {
        int count = 0;
        int lowElement = 0;
        int highElement = arr.length - 1;
        int middleElement;
        boolean isElementSearch = false;

        while(lowElement <= highElement){
            middleElement = (lowElement + highElement) / 2;

            if (arr[middleElement] == elementToSearch){
                System.out.println("\n Элемент " + elementToSearch +" найден под индексом " + middleElement );
                isElementSearch = true;
                break;
            }
            else if (arr[middleElement] > elementToSearch){
                highElement = middleElement - 1;
                count++;

            }
            else if (arr[middleElement] < elementToSearch) {
                lowElement = middleElement + 1;
                count++;
            }



        }
        if (isElementSearch !=true) {
            System.out.println("Такого элемента не существует в массиве");
        }
        System.out.println("Количество проходов " + count);


    }
}
