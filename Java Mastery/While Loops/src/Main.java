import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //while loop = repeat some code forever while some condition remains true
        //do while loop = does code before checking condition
        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age<0){
            System.out.println("invalid age");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old!");

        scanner.close();

    }
}