import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal; //original investment
        double rate; //interest rate
        int timesCompounded; //How often does our interest compound? Yearly, quarterly, monthly etc.
        int years;
        double amount; //final amount

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years); //Compound interest formula

        System.out.printf("The amount after %d years is $%.2f", years , amount);

        scanner.close();

    }
}