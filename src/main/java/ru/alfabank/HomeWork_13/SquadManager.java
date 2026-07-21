package ru.alfabank.HomeWork_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class SquadManager {

    public void demonstrateListCreations() {
        System.out.println("\n -==Formation of detachments==- ");

        // Основной отряд. х.ф. "Спасти рядового Райана"

        List<String> mainSquad = new ArrayList<>();
        mainSquad.add("John Miller");
        mainSquad.add("Mike Horvath");
        mainSquad.add("Richard Reiben");
        mainSquad.add("Daniel Jackson");

        // Отряд поддержки.
        List<String> supportSquad = Arrays.asList("Adrian Caparzo", "Timothy Upham", "James Francis Ryan");

        // Элитный отряд. х.ф. "Неудержимые" элита, ёпта!
        List<String> eliteSquad = List.of("Barney Ross", "Lee Christmas");

        System.out.println("Main squad:      " + mainSquad);
        System.out.println("Support squad:     " + supportSquad);
        System.out.println("Elite Squad:       " + eliteSquad);


        System.out.println("\n Attempts to modify the lists:");

        // Должен успешно добавить/удалить
        try {
            mainSquad.add("Mr. Church");
            System.out.println("mainSquad add: complete, " + mainSquad);
        } catch (Exception e) {
            System.out.println("mainSquad add: exceptions " + e.getClass().getSimpleName());
        }

        try {
            mainSquad.remove(0);
            System.out.println("mainSquad remove: complete, " + mainSquad);
        } catch (Exception e) {
            System.out.println("mainSquad remove: exceptions " + e.getClass().getSimpleName());
        }


        try {
            supportSquad.add("Galgo");
            System.out.println("supportSquad add: complete, " + supportSquad);
        } catch (Exception e) {
            System.out.println("supportSquad add: exceptions " + e.getClass().getSimpleName());
        }

        try {
            supportSquad.remove(0);
            System.out.println("supportSquad remove: complete, " + supportSquad);
        } catch (Exception e) {
            System.out.println("supportSquad remove: exceptions " + e.getClass().getSimpleName());
        }

        try {
            // Booker — Букер (Чак Норрис) х.ф. "Неудержимые"
            eliteSquad.add("Booker");
            System.out.println("eliteSquad add: complete, " + eliteSquad);
        } catch (Exception e) {
            System.out.println("eliteSquad add: exceptions " + e.getClass().getSimpleName());
        }

        try {
            eliteSquad.remove(0);
            System.out.println("eliteSquad remove: complete, " + eliteSquad);
        } catch (Exception e) {
            System.out.println("eliteSquad remove: exceptions " + e.getClass().getSimpleName());
        }
    }

    // Отсеивание трусов через Iterator
    public void filterOutCowards(List<String> squad) {
        System.out.println("\nSquad before filter: " + squad);

        Iterator<String> iterator = squad.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("coward")) {
                iterator.remove();
            }
        }

        System.out.println("Squad a4ter filter: " + squad);

    }

    // Альтернативная фильтрация через removeIf;

    public void runCowardsDemo() {
        System.out.println("\n-= weeding out cowards =-");

        List<String> squad = new ArrayList<>();
        squad.add("coward Vasya");
        squad.add("Shturm Ivan");
        squad.add("coward Petya");
        squad.add("Shturm Boris");
        squad.add("coward Vasiliy");

        filterOutCowards(squad);
    }
}
