public class Main {
    public static void main(String[] args) {
//Task 1
        System.out.println("\nTask 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
//Task 2
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
//Task 3
        System.out.println("\nTask 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Четными числами считаются: " + i);
        }
//Task 4
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
//Task 5
        System.out.println("\nTask 5");
        for (int i = 1904; i <= 2096; i += 4) {
            if (i % 100 != 0 || i % 400 == 0);
            System.out.printf("%s год является високосным\n", i);
        }
//Task 6
        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("Последовательность числа: " + i);
        }
//Task 7
        System.out.println("\nTask 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("Последовательность числа: " + i);
        }
//Task 8
        System.out.println("\nTask 8");
        int rublesInTheBank = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += rublesInTheBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
//Task 9
        System.out.println("\nTask 9");
        int atTheBankWithInterest = 29_000;
        for (int i = 1; i <= 12; i++) {
            atTheBankWithInterest += atTheBankWithInterest / 100;
            atTheBankWithInterest += rublesInTheBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + atTheBankWithInterest + " рублей");
        }
//Task 10
        System.out.println("\nTask 10");
        for (int o = 1, p = 2, k = 0; o <= 10; o++) {
            k = p * o;
            System.out.printf("%s * %s = %s %n", p, o, k);
        }
    }
}