package org.example.homework4;

public class NightShift {
    public static void main(String[] args) {
        String[] tests = new String[100];
        int countTests = tests.length;
        int countPassTests = 0;
        int countFlakyTests = 0;
        int countBugTests = 0;
        int countCriticalTests = 0;


        // «Шумоподавление» - если он включён — пропускайте вывод тестов со статусом Pass.
        boolean showOnlyIssues = true;

        // «Стоп-сигнал» — остановите программу раньше времени, если в процессе нашлось уже 3 теста со статусом Critical!
        boolean stopSignal = true;
        int countCrit = 0;

        // 1. Цикл для присвоения судьбы теста + 3. Подсчет для итогов смены
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                tests[i - 1] = "Critical!";
                countCriticalTests++;
            }
            else if(i % 3 == 0) {
                tests[i - 1] = "Flaky";
                countFlakyTests++;
            }
            else if (i % 5 == 0) {
                tests[i - 1] = "Bug";
                countBugTests++;
            }
            else {
                tests[i - 1] = "Pass";
                countPassTests++;
            }
        }

        // 2. Цикл вывода результата тестов в зависимости от «Шумоподавления» и «Стоп-сигнала»
        for(int i = 0; i < tests.length; i++) {
            if(showOnlyIssues) {
                if(!tests[i].equals("Pass")) {
                    System.out.printf("Тест #%d: %s%n", i+1, tests[i]);
                }
            }
            else System.out.printf("Тест #%d: %s%n", i+1, tests[i]);

            if(stopSignal && tests[i].equals("Critical!")) {
                countCrit++;

                if(countCrit == 3) {
                    System.out.println(" Слишком много критических багов — будим тимлида!");
                    break;
                }
            }
        }

        // 4. Вывод итогов смены
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.printf("Всего тестов: %d%n", countTests);
        System.out.printf("Pass: %d%n", countPassTests);
        System.out.printf("Flaky: %d%n", countFlakyTests);
        System.out.printf("Bug: %d%n", countBugTests);
        System.out.printf("Critical: %d%n", countCriticalTests);
    }
}
