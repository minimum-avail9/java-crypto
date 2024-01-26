public class CryptoCurrency {
    private  String name;
    private double price;
    private static long circulatingSupply;

    CryptoCurrency(String name, double price, long circ) {
        this.name = name;
        this.price = price ;
        circulatingSupply = circ;
    }
    public static double calculateTotalPrice(CryptoCurrency[] currencies) {
        double result = 0;
                for (CryptoCurrency curr : currencies) {
                    result += curr.price * circulatingSupply;
                }
                return result;
    }
}
