import java.io.Console;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class zadanie_2 {

    public static double getFahrenheit(double temperature, String x) {
        if (x.charAt(0) == 'c') return (temperature * 9.0) / 5.0 + 32.0;
        else if (x.charAt(0) == 'k') return (temperature * 9.0) / 5.0 - 459.67;
        else return temperature;
    }

    public static double getTemperatureFromFahrenheit(double temperature, String expecting) {
        if (expecting.charAt(0) == 'c') return (5.0/ 9.0) * (temperature - 32.0);
        else if (expecting.charAt(0) == 'k') return (5.0 / 9.0) * (temperature + 459.67);
        else return temperature;
    }

    public static void convertTemperature(){

        Console cons = System.console();
        String conversionFrom = cons.readLine("What temperature unit You want to give? (c - for celsius, k - kelvin, f - fahrenheit): ");
        String conversionTo = cons.readLine("What temperature unit You want to get? (c - for celsius k - kelvin): ");
        double temperature = Double.parseDouble(cons.readLine("What is a temperature: "));

        double value = getTemperatureFromFahrenheit(getFahrenheit(temperature, conversionFrom), conversionTo);
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP); double roundedValue = bd.doubleValue();
        System.out.println(bd);
    }
}
