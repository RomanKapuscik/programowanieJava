//import java.io.Console;
//import java.time.LocalDate;
//
//public class zadanie_3 {
//    public static String getMonth(String dateStr){
//        LocalDate date = LocalDate.parse(dateStr);
//        int year = date.getYear();
//        int monthLenght = date.lengthOfMonth();
//        int monthValue = date.getMonthValue();
//
//        String month = switch (monthValue) {
//            case 1 -> "January";
//            case 2 -> "February";
//            case 3 -> "March";
//            case 4 -> "April";
//            case 5 -> "May";
//            case 6 -> "June";
//            case 7 -> "July";
//            case 8 -> "August";
//            case 9 -> "September";
//            case 10 -> "October";
//            case 11 -> "November";
//            case 12 -> "December";
//            default -> "Wrong date format.";
//        };
//        if (monthValue == 2){
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                monthLenght = 29;
//            } else {
//                monthLenght = 28;
//            }}
//        return month + " " + monthLenght;
//    }
//
//    public static void getMonthInformation(){
//        Console cons = System.console();
//    String date = cons.readLine("Please give date in format YYY-MM-DD: ");
//    System.out.println(zadanie_3.getMonth(date));
//}
//}
//
