import java.util.Scanner;

public class ATM {

    /**
     * Prints the amount to dispense in twenties, tens, fives,
     * ones, quarters, dimes, nickels, and pennies.
     *
     * @param amount The amount in dollars.
     */
    public static void dispense(double amount) {
        int intAmount = (int) amount;
        int twenty = intAmount / 20;
        int remainderOfTwenty = intAmount % 20;

        int ten = remainderOfTwenty / 10;
        int remainderOfTen = remainderOfTwenty % 10;

        int five = remainderOfTen / 5;
        int remainderOfFive = remainderOfTen % 5;




        double totalCents = amount * 100;
        double doubleCents = totalCents - (intAmount*100);
        int cents = (int) doubleCents;


        int quarters = cents / 25;
        int remainderOfQuarters = cents % 25;

        int dimes = remainderOfQuarters / 10;
        int remainderOfDimes = remainderOfQuarters % 10;

        int nickels = remainderOfDimes / 5;
        int pennies = remainderOfDimes % 5;


        System.out.println(amount + " contains:");
        System.out.println(twenty + " in $20");
        System.out.println(ten + " in $10");
        System.out.println(five + " in $5");
        System.out.println(remainderOfFive + " in $1");
        System.out.println(quarters + " in 25¢");
        System.out.println(dimes + " in 10¢");
        System.out.println(nickels + " in 5¢");
        System.out.println(pennies + " in 1¢");
    }


    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        double amount = scn.nextDouble();
        dispense(amount);
    }
}
