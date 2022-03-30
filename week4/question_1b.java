import java.util.Scanner;

public class question_1b {
    public static void main(String[] args) {
        double amount; // 金额
        int year = 0;  // 年数
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of your money: ");
        amount = in.nextDouble();
        while (amount < 1000000) // 结束条件: 金额小于一百万
        {
            year++;
            // 存款 = 旧存款+利息+新存款
            amount = amount * (1+0.05) + 1000;
        }
        System.out.printf("year: %d\n",year);
        in.close();
    }
}