import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //for loop = execute some code a CERTAIN amount of times
        //for(statement1;statement2;statement3)
        //statement1 = for initialization (a counter); common practice: int i = 0 (or some other number); also known as loop control variable
        //statement2 = condition; when do we want to stop
        //statement3 = step/update; increments or decrements of i

        /*
        EXAMPLES:
        for(int i = 0; i < 10 ; i++){
            System.out.println("pizza");
        }
        */
        /*
        for(int i = 0; i < 10 ; i++){
            System.out.println(i);
        }
         */
        /*
        for(int i = 10; i > 0 ; i--){
            System.out.println(i);
        }
         */
        /*
        for(int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }
         */

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}