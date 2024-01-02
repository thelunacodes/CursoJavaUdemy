public class CurrencyConverter {
    public static double dollarToReal(double rs, double dollarPrice) {
        return (rs * dollarPrice) + ((rs * dollarPrice) * 6 / 100);
    }
}
