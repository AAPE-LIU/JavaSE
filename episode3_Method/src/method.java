import java.util.Scanner;

public class method {
    /**
     * 求 n 的阶乘的和
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(facSum(x));
    }

    /**
     * 求 n 的阶乘的和
     * @param n
     * @return sum阶乘的额和
     */
    public static int facSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    /**
     * 求阶乘
     * @param n 求数字n的阶乘
     * @return 返回数字n的阶乘
     */
    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
