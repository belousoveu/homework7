import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String menuChoice;
        do {
            System.out.println("1. Задача 1");
            System.out.println("2. Задача 3");
            System.out.println("3. Задача 3");
            System.out.println("4. Задача 4");
            System.out.println("5. Задача 5");
            System.out.println("6. Задача 6");
            System.out.println("7. Задача 7");
            System.out.println("8. Задача 8");
            System.out.println("9. Задача 9");
            System.out.println("10. Задача 10");
            System.out.print("Выберете пункт меню (выход - q) ");

            menuChoice = new Scanner(System.in).nextLine().toLowerCase();
            switch (menuChoice) {
                case "1":
                    task1();
                    pause();
                    break;
                case "2":
                    task2();
                    pause();
                    break;
                case "3":
                    task3();
                    pause();
                    break;
                case "4":
                    task4();
                    pause();
                    break;
                case "5":
                    task5();
                    pause();
                    break;
                case "6":
                    task6();
                    pause();
                    break;
                case "7":
                    task7();
                    pause();
                    break;
                case "8":
                    task8();
                    pause();
                    break;
                case "9":
                    task9();
                    pause();
                    break;
                case "10":
                    task10();
                    pause();
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Введено некорректное значение.");

            }
        } while (!menuChoice.equals("q"));
        System.out.println("Хорошего дня. Спасибо за проверку ДЗ");

    }

    private static void pause() throws IOException {
        System.out.println("Press Enter to continue...");
        while ((char) System.in.read() != '\n') ;
    }

    private static void task1() {
     }

    private static void task2() {
    }

    private static void task3() {
    }

    private static void task4() {
    }

    private static void task5() {
    }

    private static void task6() {
    }

    private static void task7() {
    }

    private static void task8() {
    }

    private static void task9() {
    }

    private static void task10() {
    }
}