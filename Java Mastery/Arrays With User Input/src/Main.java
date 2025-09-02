import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //to set an empty array size:
        //String[] foods = new String[3];

        //array size based on input
        String[] foods;
        int size;

        System.out.print("What # of food would you like?: ");
        size = scanner.nextInt();
        scanner.nextLine();//just to clear input buffer

        foods = new String[size];

        /*
        foods[0] = "Pizza";
        foods[1] = "Taco";
        foods[2] = "Hamburger";
        */

        for(int i = 0; i < 3; i++){
            System.out.print("Enter food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }
}