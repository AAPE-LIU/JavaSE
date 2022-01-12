import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 3){
            System.out.println(1);
        }
        else{
            for (int i = 3; i <= n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println(f3);
        }
    }
    /**
     * 用递归将一个数字的各个位相加
     * @param args
     */
    public static int locNum(int n){
        if (n/10 == 0){
            return n;
        }
        int sum = 0;
        sum = n%10 + locNum(n/10);
        return sum;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = locNum(num);
        System.out.println(result);
    }
    /**
     * 顺序打印一个数字的每一位
     * @param args
     */
    public static int orderPrint(int n){
        if (n/10 == 0){
            System.out.println(n);
            return 0;
        }
        orderPrint(n/10);
        System.out.println(n%10);
        return 0;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        orderPrint(num);
    }
    /**
     * 递归实现数字阶乘
     * @param args
     */
    public static int jiecheng(int n){
        if (n == 1){
            return 1;
        }
        int result = 1;
        result = n*jiecheng(n-1);
        return result;
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = jiecheng(num);
        System.out.println(result);
    }
    /**
     * 实现输入一个数字找出范围内所有的水仙花数，十全十美数之类的
     * @param args
     */
    public static void func(int n){
        for (int i = 1; i <= n; i++) {
            int num = i;
            int count = 0;
            while(num != 0){
                num /= 10;
                count++;
            }
        int sum = 0;
        num = i;
        while(num != 0){
            sum += Math.pow(num%10,count);
            num /= 10;
        }
        if (sum == i){
            System.out.println(sum);
        }
        }
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        func(num);
    }

}
