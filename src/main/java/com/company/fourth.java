package com.company;

import java.util.Scanner;

public class fourth {

    public static void main(String[] args) {

        String array[] = new String[2];

        for (int i = 0; i < 2; i++){
            Scanner name = new Scanner(System.in);
            System.out.print("Напишіть ім'я: ");
            if (name.hasNext()){
                array[i] = name.nextLine().toLowerCase();
            } else {
                System.out.println("Я просив ввести ім'я!");
            }
        }

        if (array[0].equals(array[1])){
            System.out.println("Одинакові імена!");
        } else {
            System.out.println("Не одинакові імена!");
        }

    }

}