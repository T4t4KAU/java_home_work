public class demo {
    public static double fun(double x) {
        return Math.pow(x,3) + Math.cos(x);
    }
    public static double fun_d(double x) {
        return 3 * Math.pow(x,2) - Math.sin(x);
    }
    public static void main(String[] args) {
        int a = -1,b = 0;
        double accuracy = 0.5E-7;
        double x = (a + b) / 2.0;

        while (fun(x) != 0 && !(Math.abs(fun(x)) <= accuracy)) {
            x = x - fun(x) / fun_d(x);
        }

        System.out.printf("x = %f",x);
    }
}