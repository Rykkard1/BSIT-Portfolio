import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in); //Must be static since static methods are using it
    public static void main(String[] args){
        //JAVA BANKING PROGRAM (BEGINNER)

        //DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //DISPLAY MENU
        while(isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            //GET AND PROCESS USERS CHOICE
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");

            }
        }

        //EXIT MESSAGE
        System.out.println("***************************");
        System.out.println("Thank you! Hava a nice day!");
        System.out.println("***************************");

        scanner.close();
    }
    //showBalance()
    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n",balance);
    }
    //deposit()
    static double deposit(){
        double amount;

        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("AMOUNT CAN'T BE NEGATIVE");
            return 0;
        }
        else{
            return amount;
        }

    }
    //withdraw
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("AMOUNT CAN'T BE NEGATIVE");
            return 0;
        }
        else if(amount>balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        }
        else{
            return amount;
        }
    }

}