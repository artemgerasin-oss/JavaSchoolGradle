package ru.alfabank.HomeWork_7.arena.heroes;

public class Archer extends Hero {
    private int arrowsCount;


    public Archer(String name, int level, int health, int arrowsCount) {
        super(name, level, health);
        this.arrowsCount = arrowsCount;
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = Math.max(0, arrowsCount);
    }

    @Override
    public void attack() {
        System.out.println("Лучник выпускает стрелу!");
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", health=" + getHealth() +
                ", arrowsCount=" + arrowsCount +
                '}';
    }
}
