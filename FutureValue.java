import java.util.Scanner;

public class FutureValue {
    // FutureValue method
    private static double futureValue(double pVal, double interest, int months){
        // exponentiate
        double num = Math.pow((1+interest),months);

        double fVal = pVal * num;
        return fVal;
    }
    // get user input and then plug it into method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the current value of the account: ");
        double userVal = input.nextDouble();
        System.out.println("Please enter the monthly interest rate for the account: ");
        double userRate = input.nextDouble();
        System.out.println("Please enter the number of months the money will remain in the account: ");
        int userMonths = input.nextInt();
        //format nice
        System.out.printf("The future value is $%.2f%n", futureValue(userVal, userRate, userMonths));


    }
}
