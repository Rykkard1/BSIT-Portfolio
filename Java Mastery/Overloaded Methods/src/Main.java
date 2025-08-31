public class Main{
    public static void main(String[] args){
        //overloaded methods = methods that share the same name, but different parameters
        //signature = name + parameters
        //no two methods can share same signature, but they can share same name

        //System.out.println(add(1,2,3 ,4));

        String pizza = bakePizza("flat bread" , "mozzarella", "pepperoni");

        System.out.println(pizza);
    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }
    static String bakePizza(String bread){
        return bread + "pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + "pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return bread + " " + cheese + " " + topping + " " + "pizza";
    }
}