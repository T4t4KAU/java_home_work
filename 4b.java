import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int count = 0,input_sum,sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sum:");
        input_sum = in.nextInt();
        while(sum < input_sum) {
            int showing = (int)(Math.random()*6);
            sum += showing;
            count++;
        }
        System.out.println("count = " + count);
    }
}