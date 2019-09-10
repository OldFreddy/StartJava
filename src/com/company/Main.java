package com.company;

import java.awt.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      int temp = func (4 , 2);
      System.out.print(temp);
      int[] arr = readArray();
      for (int i = 0; i<arr.length; i++){
          System.out.print(arr[i] + " " );
      }


    }
    public static int[] readArray(){
        int[] arr;
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();

        }
        return arr;

    }

    public static int func(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }


}
