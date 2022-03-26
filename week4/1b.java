import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        double amount;
        int year = 0;
        Scanner in = new Scanner(System.in);
        amount = in.nextDouble();
        while (amount < 1000000)
        {
            year++;
            amount = amount * (1+0.05) + 1000;
        }
        System.out.printf("%d\n",year);
    }
}