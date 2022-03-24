import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int count = 0;
        while(true) {
            count++;
            int showing = (int) (Math.random() * 6);
            if (showing == 2) {
                break;
            }
        }
        System.out.println(count);
    }
}