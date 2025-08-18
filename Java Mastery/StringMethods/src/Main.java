public class Main{
    public static void main(String[] args) {

        String name = "Felino Malicdem";

        //to get no. of letters use name.length();
            int length = name.length();
        //to get the letter at a given index (0 for first letter, 1 for second, so on), use name.charAt();
            char letter = name.charAt(0);
        //to find the first index of a given letter, use name.indexOf();
            int index = name.indexOf("o");
        //to find the last index of a given letter, use name.lastIndexOf();
            int lastIndex = name.lastIndexOf("M");

        /*to turn all characters into lower/upper case
            name = name.toLowerCase();
            name = name.toUpperCase();
        */
        /*to get rid of white space
            name = name.trim();
         */
        /*to replace a character with another character
            name = name.replace("target","replacement");
         */
        /*boolean (returns true or false)
            name.isEmpty(); --> checks if said text is empty
                sample if statement:
                    if(name.isEmpty()){
                        System.out.print("You didn't enter your name!");
                    }
                    else {
                        System.out.print("Hello, " + name + "!");
                    }
            name = name.contains(" "); --> checks if said text contains said character
                sample if statement:
                    if(name.contains(" ")){
                        System.out.print("Your name contains SPACE");
                    }
                    else {
                        System.out.print("Your name doesn't contain SPACE");
                    }
            name = name.equals(" ") --> checks if entered variable is the same as given variable (useful for username password)
            **use name.equalsIgnoreCase("") to ignore case sensitivity
                sample if statement:
                    if(name.equals("Felino Malicdem")) {
            System.out.println("Welcome, " + name);
        }
        else{
            System.out.println("Invalid username");
        }
         */
        System.out.println(name);


    }
}