package ru.alfabank.HomeWork_7.arena.heroes;

public class Hero {
    // имя героя — уникально для каждого (нестатическое).
    private String name;

    // уровень героя — различается у каждого героя (нестатическое).
    private int level;

    // текущее здоровье — уникально для каждого героя (нестатическое).
    private int health;

    //это статическая константа - общее правило всей игры.
    public static final int MAX_LEVEL = 100;

    public static int heroesCreated = 0;
//======================================================================================================================
    public Hero() {
        this.name = "Unknown";
        this.level = 1;
        this.health = 100;
        heroesCreated++;
}

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = Math.max(1, Math.min(level, MAX_LEVEL));
        this.health = Math.max(0, health);
        heroesCreated++;
    }
    //---------------------------------------------------------set
    public void setHealth(int health){
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = Math.max(1, Math.min(level, MAX_LEVEL));
    }
    //---------------------------------------------------------get
    public int getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
//======================================================================================================================
    public void printInfo(){
        System.out.println("Герой - " + name + "\nLVL = " + level + "\nЗдоровье = " + health);
    }

    //Используем встроенный метод Math.max, чтобы значение здоровья никогда не опускалось ниже нуля.
    public void takeDamage(int damage){
        this.health = Math.max(0, health - damage);
    }

    //увеличивает уровень на 1,но не позволяет превысить максимальный уровень.
    public void levelUp(){
        if (this.level < MAX_LEVEL) {
            this.level++;
        }
    }

    //Универсальный метод.
    public void attack(){
            System.out.println("Герой наносит обычный удар.");
        }

    //Универсальный метод + цель удара.
    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    //Универсальный метод + цель удара + время.
    public void attack(String target, int times) {
        System.out.println("Герой атакует цель " + target + " " + times + " раза.");
    }

    //Метод - сколько героев создано.
    public static void printHeroesCreated(){
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public final void rest(){
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }




    }

