public class question_3 {
    // 原函数: f(x) = x^3+cos(x)
    public static double fun(double x) {
        return Math.pow(x,3) + Math.cos(x);
    }
    // 导函数: f'(x) = 3*x^2-sin(x)
    public static double fun_d(double x) {
        return 3 * Math.pow(x,2) - Math.sin(x);
    }
    public static void main(String[] args) {
        int a = -1,b = 0; // 区间[-1,0]
        double accuracy = 0.5E-7;
        double x = (a + b) / 2.0;

        // 函数值为0或小于精度则停止循环
        while (fun(x) != 0 && !(Math.abs(fun(x)) <= accuracy)) {
            x = x - fun(x) / fun_d(x); // 更新点
        }

        System.out.printf("x = %f\n",x);
    }
}