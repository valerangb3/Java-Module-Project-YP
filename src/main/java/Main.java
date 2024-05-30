import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Объявление переменной товара
        Good good;
        ArrayList<Good> goodList;
        // Объявление переменной калькулятора
        Calculator calculator = new Calculator();

        //Переменные для товара
        String goodName;
        double goodPrice;

        //Переменная для работы цикла
        boolean exitLoop = false;

        //Этап получение количества человек1
        int countPeople = ScannerHelper.getCountPeople(scanner);

        //Этапы:
        //1) Получение обекта товара
        //2) Добавление товара к расчету
        while (!exitLoop) {
            boolean isAdd = false;

            goodName = ScannerHelper.getName(scanner);
            goodPrice = ScannerHelper.getPrice(scanner);

            //Получаем обект товара
            good = new Good(goodName, goodPrice);
            //Добавляем товар в калькулятор
            isAdd = calculator.addGood(good);
            if (isAdd) {
                //Запрас на остановку рассчета
                exitLoop = ScannerHelper.canStopCalculate(scanner);
            } else {
                System.out.println("Произошла ошибка добавления\nПопробуйте ввести товар снова");
            }

        }

        calculator.printResult(countPeople);

        scanner.close();

    }
}