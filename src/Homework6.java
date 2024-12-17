public class Homework6 {
    public static void main(String[] args) {
        // Задача #1
        System.out.println("Задача #1");
        int investment = 15_000;
        int total = 0;
        int months = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + investment;
            months++;
        System.out.println("Месяц " + months + ", сумма накоплений равна " + total);
        }
        System.out.println("Для того, чтобы накопить " + total + " рублей, понадобится " + months + " месяцев");

        // Задача #2
        System.out.println("Задача #2");
        int number = 10;
        while (number >= 1) {
            System.out.print(number + " ");
            number--;
        }
        System.out.println();
        for (int number2 = 1; number2 <= 10; number2++) {
            System.out.print(number2 + " ");
        }

        // Задача #3
        System.out.println("Задача #3");
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        int year = 1;
        while (year <= 10) {
            population = (population / 1000) * birthrate - (population / 1000) * mortality + population;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }

        // Задача #4
        System.out.println("Задача #4");
        double total2 = 15_000;
        double percentage = 0.07;
        int month = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 * percentage + total2;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + (long) total2 + " рублей");
        }
        System.out.println("Сумма в " + (long) total2 + " рублей будет накоплена за " + month + " месяцев");

        // Задача #5
        System.out.println("Задача #5");
        double total3 = 15_000;
        month = 0;
        while (total3 <= 12_000_000) {
            total3 = total3 * percentage + total3;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + (long) total3 + " рублей");
            }
        }

        // Задача #6
        System.out.println("Задача #6");
        double total4 = 15_000;
        month = 0;
        while (month < 108) {
            total4 = total4 * percentage + total4;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + (long) total4 + " рублей");
            }
        }
        int year1 = month / 12;
        System.out.println("За " + year1 + " лет удастся накопить " + (long) total4 + " рублей");

        // Задача #7
        System.out.println("Задача #7");
        int friday = 3;
        while (friday > 0 && friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }

        // Задача #8
        System.out.println("Задача #8");
        int yearNow = 2024;
        int pastYear = yearNow - 200;
        int nextYear = yearNow + 100;
        while (pastYear <= nextYear) {
            if (pastYear % 79 == 0) {
                System.out.println(pastYear);
            }
            pastYear++;
            }
        }
        }