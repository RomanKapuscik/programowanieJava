import java.io.Console;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Zadanie_4

class zadania {
    static Console cons = System.console();
    // Zadanie_1
    public static void printHelloToUser(){
        String username = cons.readLine("What is Your name: ");
        System.out.printf("Hello, %s\n", username);
    }
    // Zadanie_2
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

//        Console cons = System.console();
        String conversionFrom = cons.readLine("What temperature unit You want to give? (c - for celsius, k - kelvin, f - fahrenheit): ");
        String conversionTo = cons.readLine("What temperature unit You want to get? (c - for celsius k - kelvin): ");
        double temperature = Double.parseDouble(cons.readLine("What is a temperature: "));

        double value = getTemperatureFromFahrenheit(getFahrenheit(temperature, conversionFrom), conversionTo);
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP); double roundedValue = bd.doubleValue();
        System.out.println(bd);
    }
    // Zadanie_3
    public static String getMonth(String dateStr){
        LocalDate date = LocalDate.parse(dateStr);
        int year = date.getYear();
        int monthLenght = date.lengthOfMonth();
        int monthValue = date.getMonthValue();

        String month = switch (monthValue) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong date format.";
        };
        if (monthValue == 2){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                monthLenght = 29;
            } else {
                monthLenght = 28;
            }}
        return month + " " + monthLenght;
    }
    public static void getMonthInformation(){
//        Console cons = System.console();
        String date = cons.readLine("Please give date in format YYY-MM-DD: ");
        System.out.println(getMonth(date));
    }

    // Zadanie_4
    public static void checkLoginAndPassword() {
//
        Map<String, String> users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");

//            Scanner scanner = new Scanner(System.in);
//        Console console = System.console();

//            System.out.print("Login: ");
//            String login = scanner.nextLine();
//            System.out.print("Password: ");
//            String password = scanner.nextLine();

        String login = cons.readLine("Login: ");
        char[] passwordArray = cons.readPassword("Password: ");
        String password = new String(passwordArray);

        // Sprawdzanie, czy login i hasło są poprawne
        if (users.containsKey(login) && users.get(login).equals(password)) {
            System.out.println("Logging successful!");
        } else {
            System.out.println("Incorrect login or password.");
        }
//            scanner.close()
    }

    public static void main(String[] args) {
        // Zadanie_1
        System.out.println("Zadanie_1 \n");
        printHelloToUser();
        // Zadanie_2
        System.out.println("Zadanie_2 \n");
        convertTemperature();
        // Zadanie_3
        System.out.println("Zadanie_3 \n");
        getMonthInformation();
        // Zadanie_4
        System.out.println("Zadanie_4 \n");
        checkLoginAndPassword();
    }
}
