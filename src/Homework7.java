import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        // Задача #1
        int[] apples = new int [3];
        apples[0] = 1;
        apples[1] = 2;
        apples[2] = 3;

        double[] trees = {1.57, 7.654, 9.986};

        int[] books = {1, 5, 10, 17, 28, 63, 92};

        // Задача #2
        System.out.println("Задача #2");
        for (int index = 0; index < 3; index++) {
            if (index == 2) {
                System.out.print(apples[index]);
                break;
            }
            System.out.print(apples[index] + ", ");
        }
        System.out.println(" ");

        for (int index = 0; index < trees.length; index++) {
            if (index == trees.length - 1) {
                System.out.print(trees[index]);
                break;
            }
            System.out.print(trees[index] + ", ");
        }
        System.out.println(" ");

        System.out.println(Arrays.toString(books));

        System.out.println(" ");

        // Задача #3
        System.out.println("Задача #3");
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.print(apples[index]);
                break;
            }
            System.out.print(apples[index] + ", ");
        }
        System.out.println(" ");

        for (int index = trees.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(trees[index]);
                break;
            }
            System.out.print(trees[index] + ", ");
        }
        System.out.println(" ");

        for (int index = books.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(books[index]);
                break;
            }
            System.out.print(books[index] + ", ");
        }
        System.out.println(" ");

        // Задача #4
        System.out.println("Задача #4");
        for (int index = 0; index < 3; index++) {
            if (apples[index] % 2 != 0) {
                apples[index] = apples[index] + 1;
            }
        }
        System.out.println(Arrays.toString(apples));
    }
}
