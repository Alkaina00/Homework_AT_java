package org.example.homework4;

import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        // 1. Ввод данных
        String[] message = new String[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < message.length; i++) {
            message[i] = scanner.nextLine();

            // 2. Проверка корректности
            if (message[i].equalsIgnoreCase("NULL") || message[i].isEmpty()) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                message[i] = "XX";
            }
        }

        scanner.close();

        // 3. Сборка сообщения
        StringBuilder resultMessage = new StringBuilder();
        for(String part: message) {
            resultMessage.append(part);
            resultMessage.append("#");
        }

        // 4. Форматирование и вывод
        System.out.printf("Расшифрованное послание: %s", resultMessage);
    }
}
