package ru.alfabank.HomeWork_13;// Alien.java
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Alien {
    private String name;
    private String planet;
    private int dangerLevel;

    public Alien(String name, String planet, int dangerLevel) {
        this.name = name;
        this.planet = planet;
        this.dangerLevel = dangerLevel;
    }

    public String getName() {
        return name;
    }

    public String getPlanet() {
        return planet;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        // одинаковые, если совпадают name и planet
        return Objects.equals(name, alien.name) &&
                Objects.equals(planet, alien.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet);
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", planet='" + planet + '\'' +
                ", dangerLevel=" + dangerLevel +
                '}';
    }

    public static void main(String[] args) {
        // Часть 1: база пришельцев
        List<Alien> aliens = new ArrayList<>();

        aliens.add(new Alien("Pedro", "Mars", 3));
        aliens.add(new Alien("Santiago", "Jupiter", 9));
        aliens.add(new Alien("Carlos", "Saturn", 7)); // тот же name+planet, другой dangerLevel
        aliens.add(new Alien("Alejandro", "Vega", 4));
        aliens.add(new Alien("Pedro", "Mars", 5));

        System.out.println("List of aliens:");
        for (Alien a : aliens) {
            System.out.println(a);
        }

        // Проверка, содержит ли список дубликат по equals()

        boolean hasDuplicate = false;
        for (int i = 0; i < aliens.size(); i++) {
            for (int j = i + 1; j < aliens.size(); j++) {
                if (aliens.get(i).equals(aliens.get(j))) {
                    hasDuplicate = true;
                    System.out.println("\nDuplicate found by name and planet:");
                    System.out.println("  " + aliens.get(i));
                    System.out.println("  " + aliens.get(j));
                }
            }
        }

        System.out.println("\n Does the list contain duplicates? (is name+planet)? " + hasDuplicate);


        SquadManager manager = new SquadManager();
        manager.demonstrateListCreations();
        manager.runCowardsDemo();

        AssaultQueue queue = new AssaultQueue();
        queueDemo(queue);

        missionReportDemo(aliens);
    }

    //================================================================ допчик

    private static void queueDemo(AssaultQueue queue) {
        System.out.println("\n-= que in input=-");

        queue.addRecruit("Shturm 1");
        queue.addRecruit("Shturm 2");
        queue.addRecruit("Shturm 3");
        queue.addRecruit("Shturm 4");
        queue.addRecruit("Shturm 5");

        queue.printQueue();

        String gone1 = queue.retreatCoward();
        String gone2 = queue.retreatCoward();

        System.out.println("Left the front of the queue: " + gone1 + ", " + gone2);

        queue.addRecruit("Shturm 6");
        queue.addRecruit("Shturm 7");
        queue.addRecruit("Shturm 8");

        System.out.println("final state of the queue");
        queue.printQueue();
        System.out.println(queue);
    }

    private static void missionReportDemo(List<Alien> aliens) {
        System.out.println("\n -=Report to Command =-");

        MissionReport report1 = new MissionReport(
                "Shturm Zone 51",
                aliens,
                50
        );

        MissionReport report2 = new MissionReport(
                "Shturm Zone 51",
                aliens,
                50
        );

        System.out.println(report1);
        System.out.println(report2);

        System.out.println("Comparison via == : " + (report1 == report2));
        System.out.println("Comparison via equals(): " + report1.equals(report2));
    }
}

