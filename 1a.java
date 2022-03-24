import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        double amount;
        int year;
        Scanner in = new Scanner(System.in);
        amount = in.nextDouble();
        year = in.nextInt();
        for (int i = 0;i < year;i++)
        {
            amount = amount * (1+0.05);
        }
        System.out.printf("%.5f\n",amount);
    }
}