import java.util.Scanner;

public class question_4a {
    public static void main(String[] args) {
        int count = 0;
        while(true) {
            count++;
            // ειζΊζ°
            double showing = Math.ceil((Math.random() * 6));
            if (showing == 2) {
                break;
            }
        }
        System.out.println("count = " + count);
    }
}