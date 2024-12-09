public class Homework3 {
    public static void main(String[] args) {
        // Задача #1
        int age = 32;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно еще немного подождать");
        }
        // Задача #2
        int temperature = 3;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        // Задача #3
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        // Задача #4
        int age1 = 15;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else {
            if (age1 >= 7 && age1 <= 17) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
            } else {
                if (age1 >= 18 && age1 <= 24) {
                    System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
                } else {
                    System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
                }

            }
        }
        // Задача #5
        int age2 = 4;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ",то ему нельзя кататься на аттракционе");
        } else {
            if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }}
        // Задача #6
        int passengers = 61;
        if (passengers <= 60) {
            System.out.println("Если в вагоне " + passengers + " пассажиров, то в поезде еще остались сидячие места");
        }

        if (passengers > 60 && passengers <= 102) {
            System.out.println("Если в вагоне " + passengers + " пассажиров, то в вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
        // Задача #7
        int one = 9;
        int two = 5;
        int three = 8;

        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее");
        } else {
            if (two > one && two > three) {
                System.out.println("Число " + two + " наибольшее");
            } else {
                System.out.println("Число " + three + " наибольшее");
            }
        }
    }
}
