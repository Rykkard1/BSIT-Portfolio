public class Main {
    public static void main(String[] args){

        //double result = cube(3);
        //System.out.println(result);

        //or

        //System.out.println(square(3));

        //-------------------------------------------------------------

        //String fullName = getFullName("Lebron", "James");
        //System.out.println(fullName);

        //-------------------------------------------------------------

        int age = 21;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }


    }
    //method to square a number
    static double square(double number){
        return number * number;
    }
    //method to cube a number
    static double cube(double number){
        return number * number * number;
    }
    //method to return full name
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    //method to verify age
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else {
            return false;
        }
    }

}
