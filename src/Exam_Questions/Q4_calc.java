package Exam_Questions;
import java.util.Scanner;
public class Q4_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        try {
            String[] parts = input.split(" ");

            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid format! Use: number operator number");
            }

            double num1 = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double num2 = Double.parseDouble(parts[2]);
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed!");
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println( "Invalid operator! Use +, -, *, or /.");
            }

            System.out.println("Result: " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers!");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
