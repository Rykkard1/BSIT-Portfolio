import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //HYPOTENUSE c = Math.sqrt(a² + b²) <-- to square a number, ALT + 0178 (numLk on)

        //2 sides (a and b), and hypotenuse (c)
        double a;
        double b;
        double c;

        //INPUT

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        //HYPOTENUSE
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        //OUTPUT
        System.out.print("The hypotenuse is: " + c + "cm");

        scanner.close();
    }
}