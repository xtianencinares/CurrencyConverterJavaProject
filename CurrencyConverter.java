import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        initializeExchangeRates();
    }

    private void initializeExchangeRates() {     
        // Hardcoded exchange rates (as of the knowledge cutoff date) can Be change
        exchangeRates.put("USD", 1.0);   
        exchangeRates.put("EUR", 0.88);
        exchangeRates.put("GBP", 0.74);   
        exchangeRates.put("JPY", 108.96);  
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

        return amount * (toRate / fromRate);
    }
 
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble(); 

        System.out.print("Enter the currency code to convert from (e.g., USD, EUR, GBP, JPY): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency code to convert to (e.g., USD, EUR, GBP, JPY): "); 
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = converter.convertCurrency(amount, fromCurrency, toCurrency);

        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
    }
}
//Agoo Finace use only v2.1 9/04/2024
