public class Homework1 {
    public static void main(String[] args) {
        // Задача #1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача #2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача #3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача #4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача #5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача #6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerTotal = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов = " + boxerTotal + " кг");
        // Разница масс с помощью вычитания из большей суммы меньшей
        var boxerDifference1 = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов = " + boxerDifference1 + " кг");
        // Задача #7
        // Разница масс с помощью функции остаток от деления
        var boxerDifference2 = boxer2 % boxer1;
        System.out.println("Разница между массами бойцов = " + boxerDifference2 + " кг");
        // Задача #8
        // Первая часть
        var hours = 640;
        var staff = hours / 8;
        System.out.println("Всего работников в компании " + staff + " человек");
        // Вторая часть
        staff = staff + 94;
        var hoursNew = 640 / staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + hoursNew + " часов работы может быть поделено между сотрудниками");
    }
}