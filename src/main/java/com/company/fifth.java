package com.company;

import java.util.Scanner;

public class fifth {

    public static void main(String[] args) {

        String array[] = new String[2];
        String len = "";

        for (int i = 0; i < 2; i++){
            Scanner line = new Scanner(System.in);
            System.out.print("Введіть рядок: ");
            array[i] = line.nextLine();
            if (len.length() < array[i].length()){
                len = array[i];
            }
        }

        if (array[1].length() == array[0].length()){
            System.out.println("Вони одинакової довжини!");
        } else {
            System.out.println("Рядок " + len + " найдовший!");
        }

    }

}