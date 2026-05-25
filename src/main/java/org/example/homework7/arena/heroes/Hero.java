package org.example.homework7.arena.heroes;

public class Hero {
    private String name; // имя героя
    private int level; // уровень героя
    private int health; // текущее здоровье

    public static final int MAX_LEVEL = 100; // максимально возможный уровень героя: 100.
    public static int heroesCreated;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = Math.min(level, MAX_LEVEL);
        this.health = health;
        heroesCreated++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getHeroesCreated() {
        return heroesCreated;
    }

    public static void setHeroesCreated(int heroesCreated) {
        Hero.heroesCreated = heroesCreated;
    }

    public void printInfo() {
        System.out.println("Информация о герое:" );
        System.out.printf("Имя героя: %s%n", name);
        System.out.printf("Уровень: %d%n", level);
        System.out.printf("Текущее здоровье: %d%n", health);
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) this.health = 0;
        }
    }

    public void levelUp() {
        if(level < MAX_LEVEL){
            this.level++;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.printf("Герой наносит обычный удар. Цель: %s%n", target);
    }

    public void attack(String target, int times) {
        System.out.printf("Герой атакует цель %s %d раза.%n", target, times);
    }

    public static void printHeroesCreated() {
        System.out.printf("Всего создано героев: %d%n", heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }
}
