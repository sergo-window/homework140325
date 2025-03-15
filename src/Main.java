public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i ++;
            total += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Потребуется " + i + " месяцев");

        // Task 2
        System.out.println("Задача 2");
        byte a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a ++;
        }
        System.out.println();
        for (byte b = 10; b >= 1; b --) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Task 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = population/1000*17;
        int deathRate = population/1000*8;
        int populationGrowth = birthRate - deathRate;
        for (byte year = 1; year <= 10; year ++) {
            population +=populationGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Task 4
        System.out.println("Задача 4");
        int bankDeposit = 15000;
        int totalDeposit = 0;
        int month = 0;
        while (totalDeposit <= 12_000_000) {
            month ++;
            totalDeposit +=bankDeposit;
            totalDeposit +=totalDeposit/100*7;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей");
        }
        System.out.println("Василию потребуется " + month + " месяцев");

        // Task 5
        System.out.println("Задача 5");
        int bankDeposit1 = 15000;
        int totalDeposit1 = 0;
        int month1 = 0;
        while (totalDeposit1 <= 12_000_000) {
            month1 ++;
            totalDeposit1 +=bankDeposit1;
            totalDeposit1 +=totalDeposit1/100*7;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + totalDeposit1 + " рублей");
            }
        }

        // Task 6
        System.out.println("Задача 6");
        int bankDeposit2 = 15000;
        int totalDeposit2 = 0;
        int depositTerm = 0;
        while (depositTerm <= 9*12) {
            depositTerm ++;
            totalDeposit2 +=bankDeposit2;
            totalDeposit2 +=totalDeposit2/100*7;
            if (depositTerm % 6 == 0) {
                System.out.println("Месяц " + depositTerm + ", сумма накоплений равна " + totalDeposit2 + " рублей");
            }
        }

        // Task 7
        System.out.println("Задача 7");
        for (int day = 5; day <= 31; day +=7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
        }

        // Task 8
        System.out.println("Задача 8");

        int currentYear = 2025;
        int period1 = currentYear - 200;
        int period2 = currentYear + 100;
        for (int year = 0; year <= period2; year ++) {
            if (year % 79 == 0 && year >= period1) {
                System.out.println(year);
            }
        }
    }
}