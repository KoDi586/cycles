
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }
    public static void task1() {
        System.out.println("\n" +
                "=============================\n" +
                "========= Задание 1 =========\n" +
                "=============================\n");

        for ( int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
    }

    public static void task2() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 2 =========\n" +
                "=============================\n");

        for (int i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task3() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 3 =========\n" +
                "=============================\n");

        for (int i = 0; i <= 17; i += 2) {
            System.out.print(" " + i);
        }
    }
    public static void task4() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 4 =========\n" +
                "=============================\n");

        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
    }

    public static void task5() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 5 =========\n" +
                "=============================\n");

        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }

    }

    public static void task6() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 6 =========\n" +
                "=============================\n");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(" " + i);
        }

    }

    public static void task7() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 7 =========\n" +
                "=============================\n");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(" " + i);
        }

    }

    public static void task8() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 8 =========\n" +
                "=============================\n");

        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");
        }
    }

    public static void task9() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 9 =========\n" +
                "=============================\n");

        int salary = 29_000;
        float total = 0f;
        for (int i = 1; i <= 12; i++) {
            total += total / 100f;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");
        }

    }

    public static void task10() {
        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 10 =========\n" +
                "=============================\n");

        for (int i = 1; i <= 10; i++) {
            int answer = 2 * i;
            System.out.println("2*" + i + "=" + answer);
        }

    }

}

