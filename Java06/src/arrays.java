import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User: liuzong * Date: 2021-11-01
 * Time: 21:17
 */
public class arrays {
    public static void main(String[] args) {
        /**
         * 数组的两种拷贝方式，方法2
         * 使用Arrays.copyof,这个方法是整体拷贝，也可以扩容
         */
        int []array = {7,8,8,9,54,4,5};
        int []ret = Arrays.copyOf(array,array.length);//Arrays.copyof(original,数组长度)
        int []ret2 = Arrays.copyOf(array,2*array.length);//Arrays.copyof(original,数组长度)
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(ret2));
    }
    public static int [] strCopy (int []array) {
        int []ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main2(String[] args) {
        /**
         * 数组的两种拷贝方式,方法1
         */
        int []array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(strCopy(array)));

    }
    public static String myToString(int []array) {
        /**
         * 创建一个自己的数组转字符串的功能
         */
        if (array == null){
            return null;
        }
        if (array.length == 0) {
            return "";
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main1(String[] args) {
        int []array = {1,4,5,7,36,0,5,5};
//        System.out.println(Arrays.toString(array));
        System.out.println(myToString(array));
    }
}
