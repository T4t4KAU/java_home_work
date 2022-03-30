import java.util.Scanner;

public class question_1a {
    public static void main(String[] args) {
        double amount; // 存款额度
        int year;      // 年数
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of your money: ");
        amount = in.nextDouble();
        System.out.print("Enter the year: ");
        year = in.nextInt();
        for (int i = 0;i < year;i++)
        {
            amount = amount * (1+0.05);
        }
        System.out.printf("End of year amount: %.5f\n",amount);
        in.close();
    }
}