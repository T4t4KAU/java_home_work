import java.util.Scanner;

public class question_1c {
    public static void main(String[] args) {
        double amount,rate;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount:");
        amount = in.nextDouble();
        System.out.print("Enter the interest rate in percent:");
        rate = in.nextDouble() / 100.0;

        // 枚举利率 直到40年能够到达一百万
        while (amount * (Math.pow((1+rate),40)) < 1000000) {
            rate += 0.001;
        }

        System.out.printf("%.3f\n",rate);
        in.close();
    }
}