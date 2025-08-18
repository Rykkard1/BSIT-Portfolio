import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1,7); //first number is included in the roll, but the second is not
        number2 = random.nextDouble(1,7);
        isHeads = random.nextBoolean();

        //INT AND DOUBLE
        System.out.println(number1);
        System.out.println(number2);

        //BOOLEAN (coin flip)
        if(isHeads) {
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }


    }

}
