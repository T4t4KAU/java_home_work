import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        double amount,rate;
        int year;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount:");
        amount = in.nextDouble();
        System.out.print("Enter the interest rate in percent:");
        rate = in.nextDouble() / 100.0;
        while (amount * (Math.pow((1+rate),40)) < 1000000) {
            rate += 0.001;
        }

        System.out.printf("%.3f\n",rate);
    }
}