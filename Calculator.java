import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
      
        double addition = num1 + num2;
        System.out.println("Addition: " + addition);
        
       
        double subtraction = num1 - num2;
        System.out.println("Subtraction: " + subtraction);
        
       
        double multiplication = num1 * num2;
        System.out.println("Multiplication: " + multiplication);
        
        
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

       
        scanner.close();
    }
}
