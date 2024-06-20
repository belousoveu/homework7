import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
                case "q":
                    break;
                default:
                    System.out.println("Введено некорректное значение.");

            }
        } while (!menuChoice.equals("q"));
        System.out.println("Хорошего дня. Спасибо за проверку ДЗ");

    }

    private static void pause() throws IOException {
        System.out.print("Press Enter to continue...");
        while ((char) System.in.read() != '\n') ;
    }

    private static void task1() {
        int sum = 0, monthCount = 0, deposit = 15_000, targetValue = 2_459_000;
        long startTime, finishTime;
        long cycleForTime, cycleWhileTime, withoutCycleTime;
        System.out.println("Выриант 1. Использование цикла while");
        startTime = System.nanoTime();
        while (sum <= targetValue) {
            sum += deposit;
            monthCount++;
        }
        finishTime = System.nanoTime();

        System.out.printf("Месяц %d. Сумма накоплений %,d.%nВремя выполнения - %,d наносекунд.%n%n",
                monthCount, sum, cycleWhileTime = finishTime - startTime);


        monthCount = 0;
        System.out.println("Выриант 2. Использование цикла for");
        startTime = System.nanoTime();
        for (sum = 0; sum < targetValue; sum += deposit) {
            monthCount++;
        }
        finishTime = System.nanoTime();
        System.out.printf("Месяц %d. Сумма накоплений %,d.%nВремя выполнения - %,d наносекунд.%n%n",
                monthCount, sum, cycleForTime = finishTime - startTime);


        System.out.println("Выриант 3. Без использования цикла");
        startTime = System.nanoTime();
        int addMonth = (targetValue % deposit == 0) ? 0 : 1;
        monthCount = (targetValue / deposit) + addMonth;
        sum = monthCount * deposit;
        finishTime = System.nanoTime();
        System.out.printf("Месяц %d. Сумма накоплений %,d%n", monthCount, sum);
        System.out.printf("Время выполнения - %,d наносекунд.%n%n", withoutCycleTime = finishTime - startTime);

        String fastestMethod;
        if (cycleForTime <= cycleWhileTime && cycleForTime <= withoutCycleTime) {
            fastestMethod = "использовать цикл for";
        } else if (cycleWhileTime <= withoutCycleTime) {
            fastestMethod = "использовать цикл while";
        } else fastestMethod = "вообще не использовать цикл";
        System.out.printf("Вывод: самый быстрый способ решения данной задачи -  %s.%n", fastestMethod);
    }


    private static void task2() {
        int i = 1;
        while (i <= 10) System.out.printf("%d ", i++);
        System.out.println();
        for (i = 10; i >= 1; i--) System.out.printf("%d ", i);
        System.out.println();
    }

    private static void task3() {
        int population = 12_000_000;
        float mortality = 8 / 1000f, birthRate = 17 / 1000f;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Год %d. Численность населения составляет - %,d человек.%n", i,
                    population = (int) (population * (1 + (birthRate - mortality))));
        }
    }

    private static void task4() {
        int targetSum = 12_000_000, month = 0;
        float percentPerMonth = 0.07f, sum = 15_000f;
        while (sum <= targetSum) {
            month++;
            sum *= (1 + percentPerMonth);
            System.out.printf("Месяц %d. Сумма вклада на конец месяца - %,.2f.%n", month, sum);
        }

    }

    private static void task5() {
        int targetSum = 12_000_000, month = 0;
        float percentPerMonth = 0.07f, sum = 15_000f;
        while (sum <= targetSum) {
            month++;
            sum *= (1 + percentPerMonth);
            /* скорректировал условие задачи. вывод происходит не только каждый 6 месяц но последний месяц,
            когда сумма накопленного вклада достигнет целевого значения. Мне показалось, что так логичнее.
             */
            if (month % 6 == 0) {
                System.out.printf("Месяц %d. Сумма вклада на конец месяца - %,.2f.%n", month, sum);
            }
        }
        System.out.printf("Месяц %d. Сумма вклада на конец месяца - %,.2f.%n", month, sum);
    }

    private static void task6() {
        int depositTerm = 9 * 12;
        float percentPerMonth = 0.07f, sum = 15_000f;
        for (int i = 1; i <= depositTerm; i++) {
            sum *= (1 + percentPerMonth);
            if (i % 6 == 0)
                System.out.printf("Месяц %d. Сумма вклада на конец месяца - %,.2f.%n",
                        i, sum);

        }
    }

    private static void task7() {
        System.out.print("Укажите год : ");
        short year = new Scanner(System.in).nextShort();

        System.out.print("Укажите месяц : ");
        byte month = new Scanner(System.in).nextByte();
        if (validateInput(month)) {
            Calendar cal;
            if (year >= 0) {
                cal = new GregorianCalendar(year, month - 1, 1);
            } else {
                cal = new GregorianCalendar(-1 * year, month - 1, 1);
                cal.set(Calendar.ERA, GregorianCalendar.BC);
            }

            while (cal.get(Calendar.MONTH) == month - 1) {
                if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                    System.out.printf("%s - пятница. Необходимо подготовить отчет%n",
                            (year >= 0) ? new SimpleDateFormat("dd.MM.yyyy").format(cal.getTime()) :
                                    new SimpleDateFormat("dd.MM.yyyy GG").format(cal.getTime()));
                }
                cal.add(Calendar.DATE, 1);
            }

        } else System.out.println("Введен некорректный номер месяца");
    }

    private static boolean validateInput(int month) {
        return month > 0 && month <= 12;
    }

    private static void task8() {
        int period = 79;
        int currentYear = Year.now().getValue();
        for (int year = currentYear - 200; year <= currentYear + 100; year++) {
            if (year % period == 0) System.out.println(year);
        }
    }

}