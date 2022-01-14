import java.util.Scanner;

public class HanoiAndJumpFog {
    /**
     *
     * 青蛙跳台阶问题，其实就是一个斐波那契数列问题，当台阶有4个的时候
     * 第一跳跳一个台阶，剩下三个台阶，就会是三个台阶的所有可能跳法
     * 第一条跳两个台阶，剩下两个台阶，就会使两个台阶的所有可能跳法
     * 抽象出来就是 f(4) = f(2) + f(3)
     * @param
     */
    public static int jumpFog(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int result = 0;
        result = jumpFog(n-1) + jumpFog(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = jumpFog(num);
        System.out.println(result);
    }

// =-==================================================================
    public static void move(char loc1,char loc2){
        System.out.print(loc1 + "->" + loc2 + ' ');
    }

    /**
     * 注意！！要横向思考，代码纵向执行
     * @param n 汉诺塔的盘子数
     * @param loc1 起始位置
     * @param loc2 中转位置
     * @param loc3 目标位置
     */
    public static void hanoia(int n,char loc1,char loc2,char loc3){
        if(n == 1){
            move(loc1,loc3);
        }
        else{
            hanoia(n-1,loc1,loc3,loc2);
            move(loc1,loc3);
            hanoia(n-1,loc2,loc1,loc3);
        }
    }

    /**
     * 汉诺塔问题
     * @param args
     */
    public static void main1(String[] args) {
        hanoia(5,'A','B','C');
    }
}
