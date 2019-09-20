package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat bars = new Cat();
        bars.Jump();
        bars.SayMeow();

        Artifact art1 = new Artifact(1);
        Artifact art2 = new Artifact(1, "ылв");
        Artifact art3 = new Artifact(1, "ыраывп", 12);


        System.out.print(art2.culture);
        System.out.print(art2.number);

    }

    public static class Artifact {

        int number;
        String culture;
        int century;

        public Artifact(int number, String culture, int century){
            this.number = number;
            this.culture = culture;
            this.century = century;

        }

        public Artifact(int number, String culture){
            this.number = number;
            this.culture = culture;
        }

        public Artifact (int number){
            this.number = number;
        }








    }





}
