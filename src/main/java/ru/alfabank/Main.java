package ru.alfabank;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;


public class Main {


    public static void main(String[] args){


        //-------------------------Задания 1.1----------------------------------//

        String[] bascet_Petya = {"курица","бананы","творог"};
        String[] bascet_Kolya = {"курица","бананы","творог"};
        String[] bascet_Terenty = {"пиво","пельмени","ласка магия черного"};


        System.out.println("\n -=Сравнение товаров в корзинах по количеству=-");

        if (bascet_Petya.length == bascet_Kolya.length){

            System.out.println("В корзине Пети товаров = \t\t" + bascet_Petya.length);
            System.out.println("В корзине Коли товаров = \t\t" + bascet_Kolya.length);
            System.out.println("Количество товаров одинаковое! \n");
        }else{
            System.out.println("В корзине Пети товаров = \t\t" + bascet_Petya.length);
            System.out.println("В корзине Пети товаров = \t\t" + bascet_Kolya.length);
            System.out.println("Количество товаров отличается! \n");
        }

        if (bascet_Petya.length == bascet_Terenty.length){

            System.out.println("В корзине Пети товаров = \t\t" + bascet_Petya.length);
            System.out.println("В корзине Терентия товаров = \t" + bascet_Kolya.length);
            System.out.println("Количество товаров одинаковое! \n");
        }else{
            System.out.println("В корзине Пети товаров = \t\t" + bascet_Petya.length);
            System.out.println("В корзине Терентия товаров = \t" + bascet_Kolya.length);
            System.out.println("Количество товаров отличается! \n");
        }

       //------------------------------------------------------------------------------//
        System.out.println("-=Сравнение товаров в корзинах по наименованию=-");

        if (Arrays.equals(bascet_Petya,bascet_Kolya)) {
            System.out.println("Товары в корзинах Пети и Коли совпадают!");
        }else{
            System.out.println("Товары в корзинах Пети и Коли отличается");
        }

        if (Arrays.equals(bascet_Petya,bascet_Terenty)) {
            System.out.println("Товары в корзинах Пети и Терентия совпадают!");
        }else{
            System.out.println("Товары в корзинах Пети и Терентия отличается");
        }

        //-------------------------Задания 1.2----------------------------------//
        System.out.println("\n-=Ценное исследование=-");

        int arrIterator = bascet_Petya.length + bascet_Kolya.length + bascet_Terenty.length;
        String[] valueAllProductName = new String [arrIterator];

        System.arraycopy(bascet_Petya,0, valueAllProductName,0,bascet_Petya.length);
        System.arraycopy(bascet_Kolya,0, valueAllProductName,bascet_Petya.length,bascet_Kolya.length);
        System.arraycopy(bascet_Terenty,0,valueAllProductName,bascet_Petya.length + bascet_Kolya.length,bascet_Terenty.length);

        String maxValue = valueAllProductName[0];
        String minValue = valueAllProductName[0];
        int sumMeddleValue = 0;
        int resoultMeddleValue = 0;

        for(int i = 0; i < valueAllProductName.length; i++){
            //расчёт длинного значения
            if (valueAllProductName[i].length() > maxValue.length()) {
                maxValue= valueAllProductName[i];
            }
            //расчёт короткого значения
            if (valueAllProductName[i].length() < minValue.length()) {
                minValue= valueAllProductName[i];
            }
            sumMeddleValue += valueAllProductName[i].length();
        }
        resoultMeddleValue = sumMeddleValue / valueAllProductName.length;

        System.out.println("Самое короткое наименование - " + minValue + " = " + minValue.length() + " символа!");
        System.out.println("Самое длинное наименование - " + maxValue + " = " + maxValue.length() + " символов!");
        System.out.println("Среднее по больнице - " + resoultMeddleValue + " символов!");

















    }

}



