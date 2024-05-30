package com.company;

import java.util.Scanner;

public class third {

    public static void main(String[] args) {

        double array[] = new double[3];
        double numberMax = 0;

        for (int i = 0; i <3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Число: ");
            if (sc.hasNextDouble()){
                array[i] = sc.nextDouble();
                if (array[i] > numberMax) {
                    numberMax = array[i];
                }
            } else {
                System.out.println("Не правильне число!");
                break;
            }
        }

        System.out.println("Ваше максимальне число " + numberMax );





    }

}