import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Good> goodList = new ArrayList<>();

    public boolean addGood(Good good) {
        return goodList.add(good);
    }

    public ArrayList<Good> getGoodList() {
        return goodList;
    }

    public void printResult(int count) {
        double totalSum = 0.0;
        double separationSum;
        double currentPrice;
        String goodTemplate = "Товар: %s\t\tЦена: %.2f %s";
        String totalSumTemplate = "Полная сумма: %.2f %s";
        String separationTemplate = "Каждому человеку компании (из %d челевок) нужно заплатить %.2f %s";
        System.out.println("Добавленные товары:\n");

        Good good;
        for (Good value : goodList) {
            good = value;
            currentPrice = good.getPrice();
            System.out.println(String.format(goodTemplate, good.getName(), currentPrice, Formatter.getCurrency(currentPrice)));
            totalSum += currentPrice;
        }
        separationSum = totalSum / count;
        System.out.println(String.format(totalSumTemplate, totalSum, Formatter.getCurrency(totalSum)));
        System.out.println(String.format(separationTemplate, count, separationSum, Formatter.getCurrency(totalSum)));
    }
}