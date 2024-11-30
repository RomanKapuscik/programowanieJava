//import java.io.Console;
//import java.util.HashMap;
//import java.util.Map;
//
//// Zadanie_4
//
////    public class Main {
////        public static void main(String[] args) {
//
//            Map<String, String> users = new HashMap<>();
//            users.put("user1", "password1");
//            users.put("user2", "password2");
//            users.put("user3", "password3");
//
////            Scanner scanner = new Scanner(System.in);
//            Console console = System.console();
//
////            System.out.print("Login: ");
////            String login = scanner.nextLine();
////            System.out.print("Password: ");
////            String password = scanner.nextLine();
//
//            String login = console.readLine("Login: ");
//            char[] passwordArray = console.readPassword("Password: ");
//            String password = new String(passwordArray);
//
//            // Sprawdzanie, czy login i hasło są poprawne
//            if (users.containsKey(login) && users.get(login).equals(password)) {
//                System.out.println("Logging successful!");
//            } else {
//                System.out.println("Incorrect login or password.");
//            }
////            scanner.close();
//        }
//    }
//
