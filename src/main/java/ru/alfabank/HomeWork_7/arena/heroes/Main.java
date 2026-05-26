package ru.alfabank.HomeWork_7.arena.heroes;

public class Main {

    public static void main(String[] args){

        Hero[] heroes = {
                new Knight("Арагорн", 10, 95, 50),
                new Archer("Леголас", 8, 100, 60),
                new Mage("Гэндальф", 12, 80, 120),
        };

        // полиморфизм: вызов методов через тип Hero, при вызове метода атаки дёргается конкретный объект,
        // внутри которого метод переопределён и поэтому вызывается метод соответствующий объекту.
        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
            System.out.println();
        }


        // проверка heroesCreated
        Hero.printHeroesCreated();



        // пример с final reference
        final Knight knight = new Knight("БоберКурва", 1, 100, 20);


        System.out.println("Перед изменением:");
        System.out.println(knight);

        // поля можно менять, нельзя — переназначать саму переменную knight
        knight.setHealth(130);
        knight.setArmor(35);

        System.out.println("После изменения полей:");
        System.out.println(knight);


    }

    }

