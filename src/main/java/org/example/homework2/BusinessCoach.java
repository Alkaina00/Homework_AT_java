package org.example.homework2;

import java.util.Random;

public class BusinessCoach {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100);
        double moneyAccount = random.nextDouble(100_000);
        moneyAccount = Math.round(moneyAccount * 100.0) / 100.0;

        System.out.println("Возраст: " + age + "\n" + "Сумма на счете: " + moneyAccount);

        boolean invitation = false;
        boolean blacklist = false;

        boolean fullAge = age >= 18;
        boolean invitationOrLotOfMoney = invitation || moneyAccount > 50_000;
        boolean notBlacklist = !blacklist;

        boolean result = fullAge && invitationOrLotOfMoney && !blacklist;

        System.out.println("Есть 18 лет? " + fullAge);
        System.out.println("Есть приглашение или на счёте больше 50000? " + invitationOrLotOfMoney);
        System.out.println("Посетитель не в черном списке? " + notBlacklist);

        System.out.println("\n" + "Пользователь проходит? " + result);

        double fee = moneyAccount * 0.075;
        System.out.println("Обязательный добровольный взнос: " + String.format("%.2f", fee));
    }
}
