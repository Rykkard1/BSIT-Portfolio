public class Main{
    public static void main(String[] args) {
        //PI
        System.out.println(Math.PI);
        //EULER'S NUMBER
        System.out.println(Math.E);

        double result;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;
        double result8;


        //To raise a base to a power, use Math.pow(base, power);
        result = Math.pow(2, 3);
        //To get the absolute value, use Math.abs(number);
        result2 = Math.abs(-5);
        //To get the square root of a number, use Math.sqrt(number);
        result3 = Math.sqrt(9);
        //To round off a number to the nearest whole integer, use Math.round(number);
        result4 = Math.round(3.14);
        //To always round up a number, use Math.ceil(number);
        result5 = Math.ceil(3.14);
        //To always round down a number, use Math.floor(number);
        result6 = Math.floor(3.99);
        //To find a max in a range of numbers, use Math.max(number);
        result7 = Math.max(10,20);
        //To find a min in a range of numbers, use Math.min(number);
        result8 = Math.min(10,20);

        //OUTPUT
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println((result5));
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}