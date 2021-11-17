import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-03
 * Time: 1:56
 */
public class TwoDimArr {
    public static void main(String[] args) {
        /**
         * 但是也不是说下面这种方法就不能用
         * 如果将引用都实例化了对象，就可以使用了
         */
        int [][]array = new int[3][4];
        array[0] = new int[4];
        array[1] = new int[5];//即使和最开始的二维数组的列数不同也没关系，因为具体实例化的操作最后谁来执行谁就说了算
        array[2] = new int[3];
//        array[3] = new int[4];//但是行不可以越界，因为行代表的是引用类型，代表了地址，没分配地址就是没分配地址
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main6(String[] args) {
        /**
         * java中的二维数组是不可以省略行的，可以省略列，但是省略了之后会比较麻烦
         * 例如下面的例子
         */
        int [][]array1 = new int[2][];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {//这样输出会报空指针异常错误
                // 因为现在array根本就是空的，哪里来的length？根本就没这一项
                System.out.println(array1[i][j]);
            }
        }
    }
    public static void main5(String[] args) {
        /**
         * 那么int []array = new int[][];这种形式array中存放的初始值是多少呢？
         */
        int [][]array1 = new int[3][5];
        System.out.println(Arrays.deepToString(array1));//全是0
    }
    public static void main4(String[] args) {
        /**
         * 如何以Arrays.toString的方式输出呢？直接使用Arrays.toString吗？
         */
        int []array = {1,2,4,5,6,3};
        System.out.println(Arrays.toString(array));
        int [][]array3 = new int[][]{{7,2,4},{1,2,3}};
        System.out.println(Arrays.toString(array3));
        /**
         * 这样操作打印的却是两个地址，为什么呢？
         * 因为这个引用中，即array3中有两个元素，只不过这两个元素分别是两个一维数组
         * 因此要进行更深一层的转换字符串即deepToString
         */
        System.out.println(Arrays.deepToString(array3));
    }
    public static void main3(String[] args) {
        /**
         * 现在来看不规则数组的打印输出
         */
        int [][]array1 = {{1,2,3},{2,3}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main2(String[] args) {
        /**
         * 那么知道了怎么创建，我们该怎么用呢？
         * 首先来看打印输出二维数组中的元素
         */
        int [][]array3 = new int[][]{{7,2,4},{1,2,3}};
        /**
         * 第一种输出方式
         */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        /**
         * 第二种输出方式
         */
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        /**
         * 第三种输出方式
         */
        for (int []x:array3) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    public static void main1(String[] args) {
        /**
         * Java中二维数组的三种定义方式
         */
        int [][]array1 = {{1,2,3},{2,3}};//为什么可以定义成列不同呢？因为java中二维数组的排列方式与C语言的不一样
        //[]内不要写参数，因为它相当于是类型，在这里有两个[][]就相当于是二维数组类型的数据
        int [][]array2 = new int[2][];//这种定义方式，可以只指定行，不指定列，这也与java中二维数组的存储方式有关
        int [][]array3 = new int[][]{{7,2,4},{1,2,3}};
    }
}
