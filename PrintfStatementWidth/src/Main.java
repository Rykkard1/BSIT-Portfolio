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

        WIDTH:
        0 = zero padding
        number = right justified padding
        negative number = left justified padding
         */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}