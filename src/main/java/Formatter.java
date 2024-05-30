public class Formatter {
    public static String getCurrency(double price) {
        String currency;
        int num = (int) price % 100;
        if (num > 19) {
            num = num % 10;
        }
        switch (num) {
            case 1:
                currency = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                currency = "рубля";
                break;
            default:
                currency = "рублей";
                break;
        }

        return currency;
    }
}
