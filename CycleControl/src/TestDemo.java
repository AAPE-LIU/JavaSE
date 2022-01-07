import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Random rand = new Random(2120125);
        int a = rand.nextInt(100) + 1; //[1,101)
        System.out.println(a);
    }
    public static void main3(String[] args) {
        /**
         *
         * 找出 1-100 之间能同时被3和5整除的数字
         */
        for (int i = 3; i <101 ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main2(String[] args) {
        /**
         * 求 1-n 的阶乘的和
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        /**
         * switch 测试
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 2:
                System.out.println("today is " + 1);
                break;
            case 1:
                System.out.println("today is " + 2);
                break;
            default:
                System.out.println("today is nothing");
        }
    }
}
