public class Homework2 {
    public static void main(String[] args) {
     // Задача #1
     int bananas = 2_042_530;
     byte cats = 96;
     short bottles = 21_423;
     long meters = 934_726_483L;
     float parts = 3.463F;
     double portions = 3.492837587;
     System.out.println("Значение переменной bananas с типом int = " + bananas);
     System.out.println("Значение переменной cats с типом byte = " + cats);
     System.out.println("Значение переменной bottles с типом short = " + bottles);
     System.out.println("Значение переменной meters с типом long = " + meters);
     System.out.println("Значение переменной parts с типом float = " + parts);
     System.out.println("Значение переменной portions с типом double = " + portions);
     // Задача #2
     float packs = 27.12F;
     long people = 987_678_965_549L;
     double tv = 2.786;
     short dogs = 569;
     short box = -159;
     int pants = 27_897;
     byte book = 67;
     // Задача #3
     byte class1 = 23;
     byte class2 = 27;
     byte class3 = 30;
     short paper = 480;
     int paperPerPerson = paper / (class1 + class2 + class3);
     System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги");
     // Задача #4
     byte bottles2Minutes = 16;
     int bottlesPerHour = bottles2Minutes * 30;
     int bottlesPer20Minutes = bottles2Minutes * 10;
     int bottlesPerDay = bottlesPerHour * 24;
     int bottlesPer3Days = bottlesPerDay * 3;
     int bottlesPerMes = bottlesPerDay * 30;
     System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " бутылок");
     System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
     System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " бутылок");
     System.out.println("За месяц машина произвела " + bottlesPerMes + " бутылок");
     // Задача #5
     byte paint = 120;
     byte white = 2;
     byte brown = 4;
     int paintPerClass = white + brown;
     int classes = paint / paintPerClass;
     int whiteAll = white * classes;
     int brownAll = brown * classes;
     System.out.println("В школе, где " + classes + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски");
     // Задача #6
     byte bananaAmount = 5;
     byte bananaWeight = 80;
     short milkMl = 200;
     float milkGrWeight = 105f / 100;
     byte iceCreamWeight = 100;
     byte iceCreamPacks = 2;
     byte eggWeight = 70;
     byte eggAmount = 4;
     float breakfastGr = (bananaWeight * bananaAmount) + (milkGrWeight * milkMl) + (iceCreamWeight * iceCreamPacks) + (eggWeight * eggAmount);
     float breakfastKg = breakfastGr / 1000f;
     System.out.println("Спортзавтрак весит " + breakfastGr + " гр или " + breakfastKg + " в кг");
     // Задача #7
     short grPerDay1 = 250;
     short grPerDay2 = 500;
     byte kgToLose = 7;
     int grToLose = kgToLose * 1000;
     int days1 = grToLose / grPerDay1;
     int days2 = grToLose / grPerDay2;
     int averageDays = (days1 + days2) / 2;
     System.out.println("Если спортсмен каждый день будет терять по 250 грамм, то у него уйдет " + days1 + " дней на похудение");
     System.out.println("Если спортсмен каждый день будет терять по 500 грамм, то у него уйдет " + days2 + " дней на похудение");
     System.out.println("В среднем спортсмену потребуется " + averageDays + " дней, чтобы добиться результата похудения");
     // Задача #8
     int salary1 = 67_760;
     int salary2 = 83_690;
     int salary3 = 76_230;
     int percent = 10;
     float percentInNumber = (percent / 100f) + 1;
     float salaryNew1 = salary1 * percentInNumber;
     float salaryNew2 = salary2 * percentInNumber;
     float salaryNew3 = salary3 * percentInNumber;
     int salary1PerYear = salary1 * 12;
     float salaryNew1PerYear = salaryNew1 * 12;
     int salary2PerYear = salary2 * 12;
     float salaryNew2PerYear = salaryNew2 * 12;
     int salary3PerYear = salary3 * 12;
     float salaryNew3PerYear = salaryNew3 * 12;
     float salaryDifference1 = salaryNew1PerYear - salary1PerYear;
     float salaryDifference2 = salaryNew2PerYear - salary2PerYear;
     float salaryDifference3 = salaryNew3PerYear - salary3PerYear;
     System.out.println("Маша теперь получает " + salaryNew1 + " рублей. Годовой доход вырос на " + salaryDifference1 + " рублей в год");
     System.out.println("Денис теперь получает " + salaryNew2 + " рублей. Годовой доход вырос на " + salaryDifference2 + " рублей в год");
     System.out.println("Кристина теперь получает " + salaryNew3 + " рублей. Годовой доход вырос на " + salaryDifference3 + " рублей в год");
    }
}
