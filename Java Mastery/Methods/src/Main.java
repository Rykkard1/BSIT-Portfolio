public class Main{
    public static void main(String[] args){
        //method - a block of reusable code that is executed when called ()
        //methods are unfamiliar with any variables declared within other methods
        //you can send information from one method to another, these are called arguments

        String name = "Lebron James";
        int age = 40;

        happyBirthday(name, age);



    }
    //since method is being called from main method which is static, it must also be static
    //matching set of parameters in () should be set up in order to receive arguments
    //names of parameters can be different, but data types must be the same
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}