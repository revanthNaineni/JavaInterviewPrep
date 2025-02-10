package dateAPI;
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        double amount = 12345.67;

        // Locale for US
        Locale usLocale = Locale.US;
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        System.out.println("US Format: " + usFormat.format(amount)); // Output: $12,345.67

        // Locale for France
        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        System.out.println("France Format: " + franceFormat.format(amount)); // Output: 12 345,67 €
    }
}
