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
            System.out.printf("%s год является високосным\n", i);
        }
    }
}