import java.util.Scanner;

public class ScannerHelper {

    public static final String DONE_EXECUTE_COMMAND = "завершить";

    public static int getCountPeople(Scanner scanner) {
        System.out.println("Введите количество человек:");
        int count;
        while (true) {
            if(scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count > 1) {
                    break;
                } else {
                    System.out.println("Ошибка ввода!\nВведите количество людей больше одного");
                }
            } else {
                System.out.println("Ошибка ввода!\nВведите число больше одного");

            }
            //Считываем лишний символ
            scanner.nextLine();
        }
        return count;
    }

    public static String getName(Scanner scanner) {
        String name;
        System.out.println("Введите название товара");
        name = scanner.next();
        //Считываем лишний символ
        scanner.nextLine();
        return name;
    }

    public static double getPrice(Scanner scanner) {
        System.out.println("Введите цену товара");
        double price;
        while (true) {
            if(scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                if (price > 0) {
                    break;
                } else {
                    System.out.println("Ошибка ввода!\nЦена не может быть отрицательной");
                }
            } else {
                System.out.println("Ошибка ввода!\nВведите корректную цену");
                //Считываем лишний символ
                scanner.nextLine();
            }
        }
        //Считываем лишний символ
        scanner.nextLine();
        return price;
    }

    public static boolean canStopCalculate(Scanner scanner) {
        boolean isStop = false;
        String command;
        System.out.println("Товар успешно добавлен");
        System.out.println("Продолжаем добавление?");
        System.out.println("1. Чтобы получить расчет введите команду 'Завершить'");
        System.out.println("2. Чтобы чтобы продолжить расчет введите любую команду");
        command = scanner.nextLine();
        if (command.equalsIgnoreCase(DONE_EXECUTE_COMMAND)) {
            isStop = true;
        }
        return isStop;
    }
}