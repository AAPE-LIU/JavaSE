import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User: LIUZONG
 * Date: 2021-09-17
 * Time: 19:25
 */
public class HelloWorld {
    public static void main(String[] args) {
        String a = "hello";
        switch (a) {
            case "hello":
                System.out.println(1);
                break;
            case "bit":
                System.out.println(2);
                break;
            case "liuzong":
                System.out.println(3);
                break;
            default:
                System.out.println("hehe");
                break;
        }
    }
    public static void main4(String[] args) {
        int a = 10;
        int b = 20;
        if (a == 20) {
            if (b == 10) {
                System.out.println(a);
            }
        }else {
            System.out.println(b);
        }
        if (a == 20)
            if (b == 10)
                System.out.println(b);
        else System.out.println(a);
    }
    public static void main3(String[] args) {
//        判断闰年
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
//        判断条件也可以这样写
//        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year);
            }
        }else if (year % 4 == 0) {
            System.out.println(year);
            }else {
            System.out.println("not 闰年");
        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a % 2 == 0) {
            System.out.println("a是一个偶数");
        }else {
            System.out.println("a不是一个偶数");
        }
//        System.out.println(a);
    }
    public static void main1(String[] args) {
        int a = 10;
        if(a == 10) {
            System.out.println("a = 10");
        }else if (a < 10){
            System.out.println(a+1);
        }else {
            a = a++;

        }
    }
}
