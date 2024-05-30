public class Good {
    private final String name;
    private final double price;

    Good(String goodName, double goodPrice) {
        name = goodName;
        price = goodPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
