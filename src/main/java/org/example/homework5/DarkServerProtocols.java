package org.example.homework5;

import java.time.LocalDate;
import java.util.Random;

public class DarkServerProtocols {
    public static void main(String[] args) {
        String accessCode = generateAccessCode();
        System.out.println("Протокол ГЕНЕРАТОР: \n" + accessCode);
        System.out.println("Протокол ВАЛИДАТОР: \n" + isValidCode(accessCode, 8));

        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);

        System.out.println(generateAgentId("AGENT", 42));
        System.out.println(generateAgentId("AGENT", 77));
        System.out.println(generateAgentId("AGENT", 13));
    }

    // 1. Протокол ГЕНЕРАТОР
    public static String generateAccessCode() {
        String nowYear = String.valueOf(LocalDate.now().getYear());
        int number = (int) Math.pow(3, 7);

        return nowYear + "-" + number;
    }

    // 2. Протокол ВАЛИДАТОР
    private static boolean isValidCode(String code, int minLength) {
        return code != null && code.length() >= minLength && code.contains("-");
    }

    // 3. Протокол ЛОГГЕР
    public static void logEvent(String message) {
        System.out.printf("[INFO] {%s}\n", message);
    }

    public static void logEvent(String message, boolean isCritical) {
        if(isCritical)
            System.out.printf("[CRITICAL] {%s}\n", message);
        else logEvent(message);
    }

    // 4. Протокол РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int numRandom = Math.abs(random.nextInt(1000, 10000));

        return prefix + "-" + numRandom;
    }
}
