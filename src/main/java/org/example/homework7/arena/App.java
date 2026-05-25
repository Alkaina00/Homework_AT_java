package org.example.homework7.arena;

import org.example.homework7.arena.heroes.Archer;
import org.example.homework7.arena.heroes.Hero;
import org.example.homework7.arena.heroes.Knight;
import org.example.homework7.arena.heroes.Mage;

import static org.example.homework7.arena.heroes.Hero.printHeroesCreated;

public class App {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Рыцарь", 40, 66, 50),
                new Archer("Лучник", 35, 34, 25),
                new Mage("Маг", 52, 70, 60),
        };

        for(Hero hero: heroes) {
            hero.printInfo();
            hero.attack();
            System.out.println();
        }


        final Knight knight = new Knight("Скуф", 40, 66, 50);
        System.out.println(knight);
        knight.setArmor(60);
        System.out.println(knight);

        // Статистика героев
        printHeroesCreated();
    }
}
