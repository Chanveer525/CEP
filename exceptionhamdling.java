import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Let's divide two numbers.");

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Please enter a valid denominator.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integer numbers only.");
        } finally {
            System.out.println("Thank you for using the division program.");
            scanner.close();
        }
    }
}
