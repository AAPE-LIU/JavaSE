/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-04
 * Time: 19:45
 */
public class flower {
    public static int pow2(int n) {
        if (n /10 ==0 ){
            return (int)(Math.pow(n , 3));
        }
        else {
            return (int)Math.pow(n%10,3) + pow2(n/10);
        }
    }
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i == pow2(i)){
                System.out.println(i);
            }
        }
    }
}
