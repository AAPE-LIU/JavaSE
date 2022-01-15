import java.util.Arrays;

public class Copy {
    /**
     * array.clone 直接在堆上创建一个数组的副本
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newarray = array.clone();
        System.out.println(Arrays.toString(newarray));
    }
    /**
     * Arrays.copyOfRange 拷贝一部分内容，按照下标索引进行拷贝
     * 在Java中凡是遇到 from to 基本上都是左闭右开的
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newarray = Arrays.copyOfRange(array,2,5);
        System.out.println(Arrays.toString(newarray));
    }
    /**
     * copyof整体拷贝，也可以扩容
     * @param args
     */
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newarray = Arrays.copyOf(array,2*array.length);
        System.out.println(Arrays.toString(array));
        //[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(newarray));
        //[1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0, 0]

    }
}
