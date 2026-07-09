package ru.alfabank.Battle;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random rnd = new Random();


        String archer = "Лучник";
        int powerArcher = rnd.nextInt(1001);
        int healthArcher = 100;


        String knight = "Рыцарь";
        int powerKnight = rnd.nextInt(1001);
        int healthKnight = 100;

        int summOfArcher = powerArcher + healthArcher;
        int summOfKnight = powerKnight + healthKnight;



        if(summOfKnight > summOfArcher){
            int summVictory = summOfKnight - summOfArcher;
            System.out.println("Выиграл" + archer + " со счётом = " + summVictory);
        }else {
            System.out.println("Выиграл " + archer + "со счётом = " + (summOfArcher-summOfKnight));
        }





    }


}
