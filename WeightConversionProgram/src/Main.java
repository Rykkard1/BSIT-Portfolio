import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //DECLARE VARIABLES
        double weight;
        double converted;
        int choice;
        //WELCOME MESSAGE
        System.out.println("Weight Conversion Program");
        //PROMPT FOR USER INPUT
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        System.out.print("Enter weight: ");
        weight = scanner.nextFloat();
        //CONDITIONS AND OUTPUT
        if (choice==1) {
            converted = weight*0.453592;
            System.out.printf("The converted weight is: %.2f kg", converted);
        }
        else if (choice==2) {
            converted = weight*2.20462;
            System.out.printf("The converted weight is: %.2f lbs", converted);
        }
        else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}