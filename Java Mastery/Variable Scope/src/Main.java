public class Main{

    static int x = 3; //CLASS

    public static void main(String[] args){
        //variable scope = where a variable can be accessed

        int x = 1; //LOCAL (inside a method)

        doSomething();

        System.out.println(x);
    }
    static void doSomething(){
        int x = 2; //LOCAL (inside a method)

        System.out.println(x);

        //Since this is a separate method, it has its own local scope, allowing for same variable name as method above
    }
    //imagine a neighborhood, methods are houses, class is the street. Neighbors can't see inside other houses, but they can see the variable in the street.
    //if a variable in a class has the same name as a variable in a method, Java uses the one in the method first
}