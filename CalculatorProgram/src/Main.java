import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /, ^): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        switch(operation){
            case '+' -> result = first+second;
            case '-' -> result = first-second;
            case '*' -> result = first*second;
            case '/' -> {
                if(second==0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else {
                    result = first/second;
                }
            }
            case '^' -> result = Math.pow(first, second);
            default -> {
                System.out.println("INVALID");
            validOperation = false;
            }
        }
        if(validOperation){
            System.out.println(result);
        }

        scanner.close();
    }
}