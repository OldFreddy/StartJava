package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 10, 1, 5, 17, 15, 13, 4, 6, 2, 8, 3, 5, 6, 7, 9, 4, 8, 5, 2, 5};
        int temp = 0;
        boolean finish = false;

        printArray(array);


        while (finish == false){
            finish = true;
            for (int i =0; i < array.length - 1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1] = temp;
                    finish = false;

                }
            }
            printArray(array);

        }


    }

    public static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + ", ");
        }

    }


}
