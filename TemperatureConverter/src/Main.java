import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        String choice;
        double converted;


        System.out.println("Enter the temperature: ");
        temperature = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        choice = scanner.nextLine().toUpperCase();

        converted = (choice.equals("C")) ? (temperature-32)*5/9 : (temperature*9/5)+32;

        System.out.printf("The converted temperature is: %.2f %s", converted , choice);

        scanner.close();
    }

}