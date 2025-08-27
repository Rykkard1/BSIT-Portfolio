public class Main{
    public static void main(String[] args) {
        //printf() = is a method used to format output
        //printf() = is an alternative to println
        //%[flags][width][.precision][specifier-character] <-- % sign is a placeholder for variables
        //use \n for new lines
        //use , instead of +
        /*
        %s <-- String
        %c <-- char
        %d <-- int
        %f <-- double

        FLAGS:
        + = output a plus
        , = comma grouping separator (for thousands)
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive (good for aligning numbers)
         */

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%(.2f\n", price1); //whatever number comes after %[flag][width]. displays that amount of decimal places
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
    }
}