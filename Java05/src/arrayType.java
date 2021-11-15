/**
 * Creat by Liuzong
 * Description:
 * User: liuzong
 * Date: 2021-11-01
 * Time: 3:19
 */
/*
定义数组 int[] array = {1,2,3,4,5,6,7,8,9};
其实就相当于array是int[]类型的
在C语言中数组的定义方式是int array[10] = {1,2,3,4,5,6,7,8,9,0}这样其实不是太好，因为array的类型是int[]类型的
在Java中就整挺好
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * 栈上的地址是拿不到的，定义的数组变量放在栈上（JVM虚拟机栈），而数组所指向的对象放在堆上
 * 数组名变量内存储的只是他所指对象的地址
 * 引用类型：String，数组，类，接口，枚举，抽象类
 * 通过引用类型定义的变量，它里面存放的是地址
 * 对象如果要被回收就必须没有其他对象引用
 * new在Java中就是创建一个新的实例，或者说一个新的对象
 * 引用不能指向引用，只能指向引用所指的那个对象
  */
public class arrayType {
    public static int [] func(int []array) {
        int []ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = 2 * array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        /**
         * 在Java中数组是可以作为返回值的，但是在C语言中不可以
         * 输出原来数组中的数据的2倍，并且原数组中的数据不能改变
         */
        int []array = {1,2,3,4,5,6,7,8,9};
        System.out.println("调用func之前的数组值" + Arrays.toString(array));
        int []ret = func(array);
        System.out.println("调用func之后的数组值" + Arrays.toString(array));
        System.out.println("func中的数组值" + Arrays.toString(ret));

    }
    public static void main4(String[] args) {
        /**
         * 空指针异常
         */
        int []array = null;// 这个引用不指向任何对象
        System.out.println(array.length);//会报一个空指针异常错误
    }
    public static void exchange(int []array) {
        int tmp = 0;
        tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main3(String[] args) {
        /**
         * 用方法（函数）交换两个数字的值
         */
        int a = 10;
        int b = 20;
        int []array = {a,b};
        System.out.println("交换前的数值" + Arrays.toString(array));
        exchange(array);
        System.out.println("交换之后的数据" + Arrays.toString(array));

    }
    public static void main2(String[] args) {
        /**
         * 打印数组
         */
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length ; i++) {//第一种打印方法，使用fori。fori这种方法可以获取到数组元素的下标
            System.out.println(array[i]);
        }
        for (int x: array) {//前面的参数是定义一个和数组内元素类型相同的变量来接收数组内容，后面的参数是数组名
            System.out.println(x);//第二种打印方法，使用foreach，foreach这种打印方法获取不到数组元素的下标
        }
        String ret = Arrays.toString(array);//打印数组的第三种方法，将数组转换为字符串进行整个输出，这种方法只适用于纯粹想知道数组内容
        //需要导入Arrays类，调用toString然后用一个变量来接收转换后的字符串。Arrays是一个帮助我们操作数组的工具类
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        /**
         * 数组的三种创建方法
         */
        int[] array = {1,2,3,4,5,6};
        int[] array1 = new int[10];//这里面存储的什么呢？
        int[] array3 = new int[] {5,6,4,7,8};
        System.out.println(Arrays.toString(array1));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
