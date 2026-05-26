package org.example.homework7.arena.heroes;

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
        this.arrowsCount = arrowsCount;
    }

    @Override
    public void attack() {
        System.out.println("Лучник выпускает стрелу!");
    }
}
