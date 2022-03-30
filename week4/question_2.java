import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

// 首先证明sqrt(x) + cos(x) 所选区间内是单调的
// 显然sqrt在[0,pi/2]内单调递增 cos(x)在[0.pi/2]内单调递增 因此该复合函数在区间内单调递增
// 由零点存在性定理可知零点在该区间内存在
public class question_2 {
    public static double fun(double x) {
        return Math.sqrt(x) - Math.cos(x);
    }
    public static void main(String[] args) {
        double left_x = 0,right_x = Math.PI; // 对端点赋值
        // 取得区间中点
        double mid_x = (left_x + right_x) / 2.0;
        while(mid_x > 0.5E-7) {
            if (fun(mid_x) > 0) {
                right_x = mid_x;
            }
            else if (fun(mid_x) < 0) {
                left_x = mid_x;
            }
            else
                break;
            // 更新中点
            mid_x = (left_x + right_x) / 2.0;
        }
        System.out.println(mid_x);
    }
}