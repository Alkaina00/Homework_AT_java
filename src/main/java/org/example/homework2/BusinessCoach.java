package org.example.homework2;

import java.util.Random;

public class BusinessCoach {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(80);
        double moneyAccount = random.nextDouble(100_000);

        System.out.println("Возраст: " + age + "\n" + "Сумма на счете: " + moneyAccount);

        boolean invitation = false;
        boolean blacklist = false;

        boolean fullAge = age >= 18;
        boolean lotOfMoney = moneyAccount > 50_000;

        boolean result = fullAge && (invitation || lotOfMoney) && !blacklist;

        System.out.println("Есть приглашение? " + invitation);
        System.out.println("Есть в черном списке? " + blacklist);
        System.out.println("Есть 18 лет? " + fullAge);
        System.out.println("На счете больше 50_000? " + lotOfMoney);

        System.out.println("\n" + "Пользователь проходит? " + result);
    }
}
