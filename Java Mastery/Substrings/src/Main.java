import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //.substring(start,end) --> a method used to extract a portion of a string
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@')+1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else{
            System.out.println("Invalid email");
        }
    }
}