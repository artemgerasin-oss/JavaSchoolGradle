package ru.alfabank.HomeWork_10_notWork;

import java.util.Scanner;

public class Exception_training {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);
        System.out.println("input value 1 - ");
        a = scan.nextInt();


        scan.nextLine();

        System.out.println("input value 2 - ");
        b = scan.nextInt();

        int result = a / b;


            System.out.println(result);


    }

}
