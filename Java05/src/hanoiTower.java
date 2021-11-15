import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User: liuzong
 * Date: 2021-10-31
 * Time: 22:29
 */
public class hanoiTower {
    public static void move(char pos1,char pos2) {
        System.out.print(pos1 + "->>" + pos2 + " ");//用来输出每一步具体的操作
    }
    public static void hanoiTower(int n,char pos1,char pos2,char pos3) {
        /**
         * n:盘子的个数，pos1:当前盘子所在位置，pos2：中转柱子，pos3：目的位置
         */
        if (n ==1) {
            move(pos1,pos3);// 如果输入的是1的话，就相当于只有一个盘子，就直接从1号柱子挪到2号柱子就可以，也相当于一个递归出口
        }else {//如果不是一个盘子的话，就执行下面的操作
            hanoiTower(n-1,pos1,pos3,pos2);
            //想把n个盘子挪好，就得先把上面那n-1个盘子通过三号柱子挪到2号柱子，想把n-1个盘子挪好，就得把n-2个盘子先通过3号柱子挪到二号主子
            //就这样一直递归到挪一个盘子，执行上面的if语句，此时函数归的时候，对于n=2的这个函数，此时只有1号柱子有1个盘子
            //就可以执行将盘子从1号柱子直接挪到三号柱子这个操作，同样的对于n函数，当这条语句递归结束的时候，说明上面n-1个盘子已经挪好了
            //此时只需要将最底下的那个大盘子挪到3号柱子就可以了
            move(pos1,pos3);// 将对当前递归层函数来说最底下的最大的盘子挪到三号柱子
            hanoiTower(n-1,pos2,pos1,pos3);//以上操作都完成之后，此时最大的盘子在3号柱子上，但是其他的盘子都在2号柱子上，
                                            //因此需要通过1号柱子将2号柱子上的盘子全部转移到三号柱子上
        }
    }
    public static void main(String[] args) {
        /**
         * String是引用类型的数据，不是基本数据类型
         * bool类型不能和其他数据类型相互转换
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoiTower(n,'A','B','C');
        System.out.println();
        hanoiTower(1,'A','B','C');
        System.out.println();
        hanoiTower(2,'A','B','C');
        System.out.println();
        hanoiTower(3,'A','B','C');

    }
}
