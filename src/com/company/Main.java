package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int volume = 0; //создаем переменную для вычисления объема коробки
        Box catBox = new Box(); //создаем экземпляр класса с именем catBox
        Box smallBox = new Box(); //создаем еще один экземпляр класса
        Box bigBox = new Box(); //создаем еще один экземпляр класса

        catBox.width = 10;  //присваиваем значение переменной экземпляра
        catBox.height = 15; //присваиваем значение переменной экземпляра
        catBox.depth = 20; //присваиваем значение переменной экземпляра
        boxV(catBox.width, catBox.height, catBox.depth, "catBox" );


        smallBox.width = 5;
        smallBox.height = 10;
        smallBox.depth = 10;
        boxV(smallBox.width, smallBox.height, smallBox.depth, "smallBox");

        bigBox.width = 15;
        bigBox.height = 20;
        bigBox.depth = 30;
        boxV(bigBox.width, bigBox.height, bigBox.depth, "bigBox");


        volume = catBox.width * catBox.height * catBox.depth; //вычисляем объем коробки



        //System.out.println("Объем коробки для кота = " + volume);

        }
    public static void boxV (int width, int height, int depth, String box )
    {
        int V_Box = (width * height * depth);
        if (box == "smallBox" ){
            System.out.println("Объем маленькой коробки = " + V_Box);
        }
        else if (box == "catBox"){
            System.out.println("Объем котячьей коробки = " + V_Box);
        }
        else {
            System.out.println("Объем большой коробки = " + V_Box);
        }
    }





}
