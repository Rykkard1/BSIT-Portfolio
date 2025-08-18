import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //The following are the basic variables:

        int age = 20;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Felino Edwin D. Malicdem Jr.";
        String food = "Pepperoni Pizza";
        String email = "fake123@gmail.com";
        String size = "Large";

        //This is a single-line comment

        /*
            This
            is
            a
            multi-line
            comment
         */

        System.out.println("I like pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);
        System.out.println("The year is " + year + ".");

        System.out.println("$" + price);
        System.out.println("I have a " + gpa + " GPA!");
        System.out.println("It is " + temperature + " degrees outside!");

        System.out.println(grade);
        System.out.println(currency);
        System.out.println(symbol);

        if (isStudent == true) {
            System.out.println("You are a student!");
        }
        //Since isStudent is declared true in boolean variable, it is not necessary to declare "== true"
        else {
            System.out.println("You are not a student!");
        }

        if (forSale == true) {
            System.out.println("Available!");
        } else {
            System.out.println("Not Available!");
        }

        if (isOnline) {
            System.out.println("Online!");
        } else {
            System.out.println("Offline!");
        }

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Your favorite food is " + food + "!");
        System.out.println("Your email is " + email + "!");

        //Exercises:
        System.out.println("Your choice is " + food + " size " + size + "!");
        System.out.println("The price is " + price + "!");

        if (forSale == true) {
            System.out.println("There is a " + size + " " + food + " For " + currency + price + "!");

        }
        else{
            System.out.println("The " + size + " " + food + " is currently unavailable!");
        }


    }
}
