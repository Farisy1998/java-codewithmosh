import java.text.NumberFormat;

public class NumberFormating {
    public static void main(String[] args) {
        // For formating numbers we have a inbuilt java class
        // called NumberFormat. Throught this class we can
        // format the number to a currency, precent etc.

        String euro = NumberFormat.getCurrencyInstance().format(12345.860);
        System.out.println(euro);

        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);
    }
}
