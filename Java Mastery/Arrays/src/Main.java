import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //arrays = a collection of values of the same data type
        //* think of it as a variable that can store more than one value
        //dataType[] name = {element1, element2, ...};
        //to print: System.out.println(name[index of chosen element]);

        //ex:
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //to change an element:
        fruits[0] = "pineapple";

        //to access length of array:
        int numOfFruits = fruits.length;

        //to print all elements:
        for(int i = 0; i < numOfFruits; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();

        //Array methods:
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        //enhanced for loop / for each loop:
        for(String fruit : fruits){
            System.out.println(fruit);
        } //iterates through a collection


        //System.out.println(fruits[0]);
        //System.out.println(numOfFruits);
    }
}