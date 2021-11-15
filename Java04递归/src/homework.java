import java.util.Random;
import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User: liuzong
 * Date: 2021-10-27
 * Time: 17:08
 */
   /*
    快速复制的方法，鼠标放在某一行，也不需要选中直接Ctrl+c，ctrl+v
     */
public class homework {

    /**
     * 递归的两个条件：
     * 1.有一个趋近于终止的条件
     * 2.自己调用自己
     * 递归的学习没有捷径，每一个递归问题都有一个递推公式
     * 递归问题，思考：横向思考 ，执行：纵向执行
     */
    public static void fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 1; i <=n-2 ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }
    public static void main21(String[] args) {
        /**
         * 但是在面试的时候最好不要用递归因为递归占用的内存太大，建议使用迭代也就是循环
         */
        fib2(40);
    }
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main20(String[] args) {
        /**
         * 递归求斐波那契数列
         */
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(20));
    }
    public static int sum2(int n) {
        if (n / 10 == 0){
            return n;
        }
        return (n % 10) + sum2(n / 10);
    }
    public static void main19(String[] args) {
        /**
         * 输入一个非负整数，返回组成这个整数的各个数字之和
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum2(n));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main18(String[] args) {
        /**
         * 求数字的累加和比如输入100 ，就要输出从1到100的所有数字之和
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static void num(int n) {
        /**
         * 按照顺序打印一个数的每一位数字，例如1234，输出就是1，2，3，4
         * 思路：取余十，得到每次的最后一位，除以十，依次减少位数
         * 结束条件是啥？当他除以十得到的数字是0，就可以作为结束条件了
         */
        if (n / 10 == 0) {
            System.out.println(n);
            return;
        }
        num(n/10);
        System.out.println(n % 10);
    }
    public static void main17(String[] args) {
        num(123587);
    }
    public static int fac(int n) {
        /**
         * 求阶乘，要搞清楚递推公式是什么，求n的阶乘，其实就是求n * (n-1)的阶乘，也就可以写成
         * n * fac(n-1)
         * 另外还要有一个结束条件
         * 目的是求谁，就返回谁
         */
        if (n == 1) {
            return 1;
        }
        int temp = n * fac(n-1);
        return temp;
    }
    public static void main16(String[] args) {
        System.out.println(fac(10));
    }
    /**
     * 方法的重载与重写
     * 重写要讲过类之后才可以理解
     * 重载的话，要满足三个条件
     * 1.函数名相同
     * 2.函数的参数不同
     * 3.函数的返回值类型不影响重载
     * 4.即使属于不同的类也可以
     * @param n
     * @return
     */
    public static int func(int a, int b) {
        return (a + b);
    }
    public static int func(double a,double b) {
        return (int)(a + b);  //强制类型转换中的类型名也要加上括号
    }
    public static void main15(String[] args) {
        func(3,5);
    }

    /*

     */
    public static boolean judge(int n) {
        int a = n & (n-1);
        if (a == 0) {
            return true;
        }
        return false;
    }
    public static void main14(String[] args) {
        /**
         * 百度面试题：判断一个数是不是2的k次方，不要求算出k
         * 解题关键在于明确2的k次方有什么特点
         * 如果一个数是2的k次方，那么这个数的二进制形式只能包含1个1
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(judge(n));
    }
    public static int bintotal(int n) {
        /**
         * 实现求出十进制数字对应的二进制数字中包含的1的个数
         */
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count ++;
        }
        return count;
    }
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bintotal(n));
    }
    public static void login(String word) {
        /**
         * 实现输入密码，最多输入三次，全部输错则提示机会用完
         * 问题就是，编写函数的时候会遇到这样一个问题，字符串如何进行比较呢？怎么判断相不相同呢？
         */
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String password = scanner.nextLine();
//            if (password == word) {  //这里遇到一个问题，字符串如何比较相不相同呢？这样写是错误的
              if (password.equals(word)) {
                System.out.println("密码正确");
                return;
            }else {
                  if ((3-i) != 0){
                      System.out.println("你还剩下" + (3-i) + "次机会");
                  }
            }
        }
        System.out.println("三次机会已经用完");
    }
    public static void main12(String[] args) {
        login("pigpig");
    }
    public static void func2(int n) {
        /*
        1,确定输入的数字是多少位的
         */
        for (int i = 1; i <=n ; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                num /= 10;
                count++;
            }
            num = i;
            int sum = 0;
            while (num != 0) {
               sum += Math.pow(num%10,count);
               num = num/10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
    public static void main11(String[] args) {
        /**
         * 实现任意输入的数字，将其中的自幂数，水仙花数，五角星数，十全十美数等，这类数字都打印出来
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func2(n);
    }
    public static double sum() {
        /**
         * 返回1-1/2+1/3-1/4·····-1/100的值
         */
        double sum = 0;
        for (double i = 1; i <= 100 ; i++) {
            sum += (1 / i) * Math.pow(-1,i+1);//想输出double类型的话，也可以用1.0/n，不一定要把i设置为double类型的
        }
        return sum;
    }

    public static void main10(String[] args) {
        System.out.println(sum());//写法：sum().sout 就会直接输出这行代码的样式
    }
    public static void main9(String[] args) {
        /**
         * 计算两个数的最大公约数
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        maxCommon(a,b);//如果调用的函数有返回值，可以直接写 函数名.sout  就会自动输出
    }
    public static void maxCommon(int n,int m) {
        int c = n % m;//不管是n大还是m大，都会转换成辗转相除法
        while(c != 0) {
            n = m;
            m = c;
            c = n % m;
        }
        System.out.println("最大公约数是" + m);
    }
    public static int pow2(int n) {
        /**
         * 计算水仙花数，即1000-999之间各个位数的立方加起来等于他本身的数字
         */
        int ret = 0;
        if (n <= 9) {
            return n*n*n;
        }else{
//            ret = pow2(n / 10);
            return (int)(Math.pow(n%10,3) + pow2(n/10));
        }
//        int ret2 = n % 10;
//        return (int)(ret + Math.pow(ret2,3));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 100; i <= n; i++) {
            if (i == pow2(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main7(String[] args) {
        /**
         * 猜数字游戏
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(50);
        while (true) {
            int num = scanner.nextInt();
            if (num == rand) {
                System.out.println("你猜对啦");
                break;
            }else if (num < rand) {
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }
        }
    }
    public static void main6(String[] args) {
        /**
         * 打印出来X图形
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == j) {
                    System.out.print('*');
                }else if (j == n - i + 1) {
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main5(String[] args) {
        /**
         * 根据输入的年龄，打印当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56）以上
         */
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("你还是个孩子，少年");
        }else if (age <= 28 && age >= 19){
            System.out.println("你已经是个青年了");
        }else if(age <= 55 && age >= 29) {
            System.out.println("你已经是个中年了");
        }else {
            System.out.println("老人家你好啊");
        }
    }
    public static void main4(String[] args) {
        /**
         * 判断输入的数值是否是素数
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int lab = 0;
        for (int i = 2; i < a ; i++) {  //这里可以怎么优化呢？首先可以写成n/2,如果要进一步优化的话，要写成开根号n
            /*for (int i = 2; i <= n/2; i++)
            for (int i = 2; i <= Math.sqrt(a) ; i++)*/
            if (a % i == 0) {
                lab += 1;
                System.out.println(a + "不是素数");
                break;
            }
        }
        if (lab == 0) {
            System.out.println(a + "是素数");
        }
    }
    public static void main3(String[] args) {
        /**
         * 打印1-100之间所有的素数
         */
        for (int i = 2; i <= 100 ; i++) {
            int sum = 0;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {//这里可以做一定的优化，比如开根号，取1/2
                if (i % j == 0) {
                    sum += 1;
                    break;
                }
            }
            if (sum == 0) {
                System.out.println(i);
            }

        }
    }
    public static void main2(String[] args) {
        /**
         * 输出1000-2000年之间的闰年
         */
        for (int i = 1000; i <= 2000 ; i++) {
            if (i % 100 == 0 && i % 400 == 0 || i % 4 == 0 && i %100 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        /**
         * 输出1-100之间9的个数
         */
        int sum = 0;
        char A = 'a';
        for (int i = 1; i <= 100 ; i++) {
            int ret = i % 10;
            if (ret % 10 == 9) {
                System.out.println(i);
                sum += 1;
            }
            int ret2 = i / 10;
            if (ret2 == 9) {
                System.out.println(i);
                sum += 1;
            }
        }
        //System.out.println("kjsdhfkjsd" + sum + A);输出会是kjsdhfkjsd20a
        //但是如果是System.out.println(sum + 'a');就会输出 ASCII的值相加，a与sum反过来也一样
        System.out.println(sum);

    }
}
