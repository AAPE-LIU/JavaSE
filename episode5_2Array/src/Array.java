import java.util.Arrays;

public class Array {
    // C语言中定义数组是 int arr[10]  其中int[10]是类型，arr是变量名
    // 但是这种定义方式就把类型分开了，有点不合理，所以java这点做的比较好

    // java中定义数组是 int[10] array = {1,2,3,4,5,6,7,8,9,0}
    // 类型并没有被分开

    /**
     * 数组定义的三种最基本的方式，以及三种打印方法
     * 增强for循环
     * @param args
     */
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[10];
        int[] array3 = new int[]{1,2,3,4,5,6,7};
        System.out.println(array2[3]);
        // 方法1：for循环
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        // 方法2：增强for循环，array3表示要遍历的数组，x变量作为临时接收遍历出来的数据的变量
        // 遍历一个，就打印一个
        for(int x : array3){
            System.out.println(x);
        }

        // 方法3：Arrays.toString
        // 将当前的数组转化为字符串的形式进行输出
        String ret = Arrays.toString(array3);
        System.out.println(ret);
        int[] array4 = null;// 代表这个引用不指向任何对象
        // 对象如果要被回收，那么一定是没有其他对象引用
    }
}
