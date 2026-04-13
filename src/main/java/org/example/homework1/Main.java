package org.example.homework1;

public class Main {
    public static void main(String[] args) {
        String employeeName = "Глеб";
        String position = "Старший шаурма-инженер";
        double shiftRate = 4000;
        int shiftCount = 2;
        double bonus = 3000;
        double fine = 500;
        double shawarmaPrice = 500;
        int shawarmaCountSold = 60;

        double salaryWithoutBonus = shiftCount * shiftRate;
        double finalSalary = salaryWithoutBonus + bonus - fine;

        double revenue = shawarmaPrice * shawarmaCountSold;

        System.out.println("Сотрудник: " + employeeName);
        System.out.println("Должность: " + position);
        System.out.println("Оплата за смены: " + salaryWithoutBonus);
        System.out.println("Премия: " + bonus);
        System.out.println("Штраф: " + fine);
        System.out.println("Итоговая зарплата: " + finalSalary);
        System.out.println("Шаур-выручка: " + revenue);
    }
}