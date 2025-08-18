import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        LOGICAL OPERATORS:
        && = AND
        || = OR
        ! = NOT
         */
        //sample condition: username must be between 4-12 characters
        //sample condition: username must not contain spaces or underscores

        String username;

        System.out.print("Enter new username: ");
        username = scanner.nextLine();

        if(username.length() <4 || username.length() >12){
            System.out.println("Username must be between 4-12 characters!");
        }
        else if(username.contains(" ")||username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores!");
        }
        else{
            System.out.printf("Welcome, %s!", username);
        }
        scanner.close();
    }

}
