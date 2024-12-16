public class Homework5 {
    public static void main(String[] args) {
        // Задача #1
        System.out.println("Задача #1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача #2
        System.out.println("Задача #2");
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        // Задача #3
        System.out.println("Задача #3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        // Задача #4
        System.out.println("Задача #4");
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

        // Задача #5
        System.out.println("Задача #5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача #6
        System.out.println("Задача #6");
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.println(d);
        }

        // Задача #7
        System.out.println("Задача #7");
        for (int p = 1; p <= 512; p = p * 2) {
            System.out.println(p);
        }

        // Задача #8
        System.out.println("Задача #8");
        int investment = 29_000;
        int total = 0;
        for (int monthInd = 0; monthInd < 12; monthInd++) {
            total = total + investment;
            System.out.println("Месяц " + (monthInd + 1) + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Сумма годовых накоплений равна " + total + " рублей");

        // Задача #9
        System.out.println("Задача #9");
        int total2 = 0;
        for (int monthInd = 0; monthInd < 12; monthInd++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + investment;
            System.out.println("Месяц " + (monthInd + 1) + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Сумма годовых накоплений равна " + total2 + " рублей");

        // Задача #10
        System.out.println("Задача #10");
        int result = 0;
        for (int k = 1; k <= 10; k++) {
            result = k * 2;
            System.out.println("2*" + k + "=" + result);
        }
    }
}