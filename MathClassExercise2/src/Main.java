import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI *Math.pow(radius,3)

        double radius;
        double circumference;
        double area;
        double volume;


        //INPUT
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        //PROCESSES
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


        //OUTPUT
        System.out.println("The circumference is: " + circumference);
        System.out.println("The area is: " + area + "cm²");
        System.out.println("The volume is: " + volume + "cm³");

        scanner.close();

    }
}