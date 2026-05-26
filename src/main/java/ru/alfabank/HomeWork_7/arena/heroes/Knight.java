package ru.alfabank.HomeWork_7.arena.heroes;

public class Knight extends Hero {
    private int armor;

    public Knight(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = Math.max(0, armor);
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", health=" + getHealth() +
                ", armor=" + armor +
                '}';
    }


//    @Override
//    public final void rest(){
//        System.out.println("Герой отдыхает и восстанавливает силы.");
//    }

}
