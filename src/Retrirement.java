import java.util.Scanner;

/**
 * this program demostrates a <code>while</code> loop.
 * @author YeXinqun
 */
public class Retrirement {
    public static void main(String[] args){
        //read input
        Scanner in = new Scanner(System.in);

        System.out.print("how munch money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("how munch money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        //update account balance while goal isn't reached
        while(balance<goal){
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in "+ years+"years");
    }
}
