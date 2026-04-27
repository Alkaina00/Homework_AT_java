package org.example.homework3;

import java.util.Arrays;

public class Basket {
    public static void main(String[] args) {
        String[] basketPetya = {"курица", "бананы", "творог"};
        String[] basketKolya = {"курица", "бананы", "творог"};
        String[] basketTerenti = {"пиво", "пельмени", "ласка магия черного"};

        // 1. Сравните между собой корзины по количеству товаров
        outputCountProducts("Пети", basketPetya, "Коли", basketKolya);
        outputCountProducts("Пети", basketPetya, "Терентия", basketTerenti);

        // 2. Сравните между собой корзины по их составу
        outputEqualsProducts("Пети", basketPetya, "Коли", basketKolya);
        outputEqualsProducts("Пети", basketPetya, "Терентия", basketTerenti);

        // 3. Проведите ценное исследование - привлекают ли пользователей товары с более длинными названиями?
        String[] allProducts = new String[basketPetya.length + basketKolya.length + basketTerenti.length];

        System.arraycopy(basketPetya, 0, allProducts, 0, basketPetya.length);
        System.arraycopy(basketKolya, 0, allProducts, basketPetya.length, basketKolya.length);
        System.arraycopy(basketTerenti, 0, allProducts, basketPetya.length + basketKolya.length, basketTerenti.length);

        System.out.println("Все покупки Пети, Коли и Терентия: " + Arrays.toString(allProducts) + "\n");

        // Выведите среди всех покупок Пети, Коли и Терентия товары с самым длинным названием
        System.out.println("Товары с самым длинным названием: ");
        longNameProducts(allProducts);

        // Выведите среди всех покупок Пети, Коли и Терентия товары с самым коротким названием
        System.out.println("Товары с самым коротким названием: ");
        shortNameProducts(allProducts);

        // Выведите среди всех покупок Пети, Коли и Терентия среднюю длину названия товара среди всех представленных товаров
        System.out.println("Средняя длина названия товара среди всех представленных товаров: " +
                String.format("%.2f", avgNameProduct(allProducts)) + "\n");
    }


    // метод вывода результата сравнения корзин по количеству товаров
    private static void outputCountProducts(String name1, String[] basket1, String name2, String[] basket2) {
        int count1 = basket1.length;
        int count2 = basket2.length;

        if(count1 == count2)
            System.out.println(String.format("Количество товаров в корзине у %s и %s одинаковое: %d", name1, name2, count1) + "\n");
        else if (count1 > count2)
            System.out.println(String.format("Количество товаров в корзине у %s (%d) больше чем у %s (%d) на %d.",
                    name1, count1, name2, count2, count1 - count2) + "\n");
        else
            System.out.println(String.format("Количество товаров в корзине у %s (%d) больше чем у %s (%d) на %d.",
                    name2, count2, name1, count1, count2 - count1) + "\n");
    }

    // метод вывода результата сравнения корзин по составу
    private static void outputEqualsProducts(String name1, String[] basket1, String name2, String[] basket2) {
        boolean identicallyArrays = Arrays.equals(basket1, basket2);

        if(identicallyArrays)
            System.out.println(String.format("Состав корзины %s и %s одинаковый: ", name1, name2) + Arrays.toString(basket1) + "\n");
        else
            System.out.println(String.format("Состав корзины %s и %s разный: ", name1, name2) + "\n" +
                String.format("Состав корзины %s: ", name1) + Arrays.toString(basket1) + "\n" +
                String.format("Состав корзины %s: ", name2) + Arrays.toString(basket2) + "\n");
    }

    // метод поиска товаров с самым длинным названием
    public static void longNameProducts(String[] basket) {
        // Проверка на случай пустого массива
        if (basket == null || basket.length == 0) {
            System.out.println("Нет товаров для анализа");
            return;
        }

        int maxLength = 0;

        for(String product : basket){
            if(maxLength < product.length())
                maxLength = product.length();
        }

        for(String product : basket){
            if(product.length() == maxLength)
                System.out.println(product);
        }

        System.out.println(); // для красоты вывода на случай нескольких товаров с одинаковым длинным названием
    }

    // метод поиска товара с самым коротким названием
    public static void shortNameProducts(String[] basket) {
        // Проверка на случай пустого массива
        if (basket == null || basket.length == 0) {
            System.out.println("Нет товаров для анализа");
            return;
        }

        int minLength = basket[0].length();

        for(String product : basket){
            if(minLength < product.length())
                minLength = product.length();
        }

        for(String product : basket){
            if(product.length() == minLength)
                System.out.println(product);
        }

        System.out.println(); // для красоты вывода на случай нескольких товаров с одинаковым коротким названием
    }

    // метод вычисления средней длины названия товара
    public static double avgNameProduct(String[] basket) {
        // Проверка на случай пустого массива
        if (basket == null || basket.length == 0) return 0.0;

        int sumLengthProducts = 0;
        int countProducts = basket.length;

        for(String product : basket) {
            sumLengthProducts += product.length();
        }

        // Формула вычисления средней длины названия товара: (сумма длин всех товаров) / (общее количество товаров)
        return (double) sumLengthProducts / countProducts;
    }
}













