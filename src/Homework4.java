public class Homework4 {
    public static void main(String[] args) {
        // Задача #1
        byte clientOS = 3;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У нас пока не готово приложение для вашей операционной системы");
        }
        // Задача #2
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("У нас пока не готово приложение для вашей операционной системы");
        }
        // Задача #3
        int year = 1769;
        boolean isLessThan1584 = year < 1584;
        boolean isDividedByFour = year % 4 == 0;
        boolean isDividedByFourHundred = year % 400 == 0;
        boolean isDividedByHundred = year % 100 != 0;
        if (isLessThan1584) {
            System.out.println("Все года, которые были до 1584 года, являются невисокосными");
        } else if (isDividedByFour) {
            if (isDividedByFourHundred) {
                System.out.println(year + " год является високосным");
            } else if (isDividedByHundred) {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задача #4
        int distance = 95;

        byte day1 = 1;
        byte day2 = 2;
        byte day3 = 3;

        boolean isDistanceUnder20 = distance < 20;
        boolean isDistanceUnder60 = distance >= 20 && distance <= 60;
        boolean isDistanceUnder100 = distance > 60 && distance <= 100;

        if (isDistanceUnder20) {
            System.out.println("На доставку потребуется " + day1 + " день");
        } else if (isDistanceUnder60) {
            System.out.println("На доставку потребуется " + day2 + " дня");
        } else if (isDistanceUnder100) {
            System.out.println("На доставку потребуется " + day3 + " дня");
        } else {
            System.out.println("Доставки нет");
        }
        // Задача #5
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}