import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-09-30
 * Time: 19:46
 */
public class whilecontro {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
    }
    public static void main2(String[] args) {
        int i = 1;
        int jiecheng = 1;
        while (i <= 10) {
            jiecheng *= i;
            i += 1;
        }
        System.out.println(jiecheng);

    }
    public static void main1(String[] args) {
        int i = 0;
        int result = 0;
        while (i <= 100) {
            result += i;
            i += 2;
        }
        System.out.println(result);
    }
}
