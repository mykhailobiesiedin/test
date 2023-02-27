import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result;
        String operator;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose math operator: '+', '-', '*', '/'  or '=' to finish");
            operator = scanner.next();
            switch (operator) {
                case "+" -> {
                    System.out.println("Enter two numbers : ");
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                }
                case "-" -> {
                    System.out.println("Enter two numbers : ");
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                }
                case "*" -> {
                    System.out.println("Enter two numbers : ");
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                }
                case "/" -> {
                    System.out.println("Enter two numbers : ");
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                }
                case "=" -> System.exit(0);
                default -> System.out.println("You entered the wrong operator. Enter the valid one.");
            }
        } while (!operator.equals("="));
    }
}
