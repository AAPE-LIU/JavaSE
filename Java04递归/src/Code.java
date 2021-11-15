import java.util.Random;
import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-04
 * Time: 20:06
 */
public class Code {
    /*
    如何实现将两个数字对换这个功能呢？
    java中没办法取到栈帧中的变量的地址，因此不能像C语言那样传入地址然后解引用
     */
    /*
    方法的使用
     */
        /**
         *
         * @param n 代表要求哪个数的阶乘和
         * @return 返回值是求得的阶乘和结果
         */
        public static int facSum(int n) {  //调用求阶乘的方法，求得阶乘的和
            int sum = 0;
            for (int i = 1; i <= n; i++) {  //用快捷键fori可以直接创建for循环
                sum += fac(i);
            }
            return sum;
        }
        public static int fac(int n) {  //求阶乘方法
            int ret = 1;
            for (int i = 1; i <= n; i++) {
                ret *= i;
            }
            return ret;
        }
        public static void main7(String[] args) {
            int num = facSum(5);
            System.out.println(num);
        }
    /*
    猜数字游戏
     */

        public static void main6(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random(20211027);//如果不设置随机种子的话，每一次随机的数值都是不同的，设置了随机种子的话，下次随机的数值和上次的依然相同
            int rand = random.nextInt(100);//[0,100) + 1 = [1,101)
            while (true) {
                int num = scanner.nextInt();
                if(num == rand) {
                    System.out.println("相同");
                    break;
                }else if (num > rand) {
                    System.out.println("大了");
                }else {
                    System.out.println("小了");
                }
            }
        }
        /*
        连续多次读取输入
        但是这样的话怎么停下来呢？
        在cmd窗口中摁ctrl+z
        在idea中摁ctrl+d停止程序
         */
        public static void main5(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int a = scanner.nextInt();
                System.out.println(a);
            }
        }
        public static void main4(String[] args) {
        /*
        读取键盘的输入
         */
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(a);

            float b = scanner.nextFloat();
            System.out.println(b);

            byte c = scanner.nextByte();  //byte类型的数据也是整数，只是范围比int小很多，只占一个字节
            System.out.println(c);

            String str3 = scanner.nextLine();  //这种方法，如果前面有其他的输入，这个放在最后的话，会将回车键读取进来，然后输出
            System.out.println(str3);  //所以最好将这种方法放在最开头的位置，减少出错率

            String str = scanner.next();  //String类型的数据，String首字母要大写
            System.out.println(str);  //next有个缺陷遇到空格就结束了，并不能读取完整的字符串

            String str2 = scanner.nextLine();  //这种方法，如果前面有其他的输入，这个放在最后的话，会将回车键读取进来，然后输出
            System.out.println(str2);  //所以最好将这种方法放在最开头的位置，减少出错率


        }
        public static void main(String[] args) {
            /*
             * 找到1-100之间既能被3整除也能被5整除的数字,要求使用continue或者break完成
             */
            int i = 1;
            while (i <= 100) {
                if (i % 15 != 0) {  //因为要使用continue或者break，所以设置判断条件是任何一个条件不满足就不打印，剩下的就是可以打印的
                    i ++;  //这里要在continue之前就进行变量的++操作，因为不这样做的话会陷入死循环
                    continue;
                }
                System.out.println(i);
                i ++;
            }
        }
        public static void main2(String[] args) {
            int i = 1;
            while (i <= 10) {
                if (i == 5) {
                    continue;  //continue的作用是终止本次循环，但是如果修改变量这个操作在continue之后的话，会形成死循环
                }
                System.out.println(i);
                i ++;
            }
        }
        public static void main1(String[] args) {
            int i = 1;
            while (i <= 10) {
                if (i == 5) {
                    break;  //break的作用是终止循环
                }
                System.out.println(i);
                i ++;
            }
        }
}

