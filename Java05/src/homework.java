import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User: 刘总
 * Date: 2021-11-01
 * Time: 19:30
 */
public class homework {
    public static void main(String[] args) {
        /**
         * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
         */
        int []array = new int[100];
        System.out.println("赋值之前的数组元素" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("赋值之后的数组元素" + Arrays.toString(array));
    }
    public static void printArray (int []array) {
        for (int x:
             array) {
            System.out.print(x + " ");
        }
    }
    public static void main4(String[] args) {
        /**
         * 打印数组中的每一个元素
         */
        int []array = {6,4,8,98,51,54,54,51,2};
        printArray(array);
    }
    public static void transform (int []array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }
    public static void main3(String[] args) {
        /**
         * 改变原有数组的值，变为二倍
         */
        int []array = {5,7,4,56,8,1,2,4,5};
        System.out.println("修改之前的数组元素" + Arrays.toString(array));
        transform(array);
        System.out.println("修改之后的数组元素" + Arrays.toString(array));
    }
    public static void sum (int []array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
    public static void main2(String[] args) {
        /**
         * 求数组中所有元素之和
         */
        int []array = {4,2,54,5,1,32,58,4,1,2};
        sum(array);
    }
    public static float avg (int []array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/(array.length);
    }
    public static void main1(String[] args) {
        /**
         * 求数组的平均值
         */
        int []array = {6,7,9,21,4,32,5,1};
        System.out.println(avg(array));
    }
}
