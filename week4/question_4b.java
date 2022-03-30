import java.util.Scanner;

public class question_4b {
    public static void main(String[] args) {
        int count = 0,input_sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sum:");
        input_sum = in.nextInt(); // 读入用户输入的和
        if (input_sum > 12 || input_sum < 2)
            System.out.println("wrong input(2<=sum<=12)");
        while(true) {
            count++;
            // 当和达到要求时则停止循环
            double num1 = Math.ceil((Math.random()*6)); // 骰子1
            double num2 = Math.ceil((Math.random()*6)); // 骰子2
            if (num1 + num2 == input_sum)
                break;
        }
        System.out.println("count = " + count);
        in.close();
    }
}