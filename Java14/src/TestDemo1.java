//import java.util.Arrays;
//import java.util.Scanner;
import edu.whu.testdemo.TestDemo;

import java.util.*;//*通配符，这并不是导入util包底下的所有类，而是用到谁才导谁；
                    //有了这个，就不需要导入其他的util包底下的东西了
import java.util.Date;
//import static java.lang.System.*;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-10
 * Time: 23:46
 */
public class TestDemo1 {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.age);
//        System.out.println(testDemo.sex);//这个不可以访问，因为sex默认是包访问权限，只能在同一包中访问
//        System.out.println(testDemo.name);//这个只能在那一个类中才可以访问
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        String str = "alkshdfksjdlikf";//这个是属于java.lang.String的，但是为什么不导入这个包也可以运行呢？
        //java.lang这个包，不需要手动导入，但是lang文件夹下的子文件夹中的，可能还需要手动导入

        //java.util.Date date = new java.util.Date();//也可以不在代码开头import包，在代码中直接import
        //但是没啥人会这样写。。所以还是导包

        Date date = new Date();//上面我已经将util的包导入进来了，为什么会报错呢？因为有两个包里面包含Date
                                //util中有，sql中也有，所以这个时候编译器就蒙了；到底该用哪个？
                                //这种情况下该怎么办？方法就是只能自己指定Date是哪个包里的
        /**
         * 剖析System.out.println()
         * 可不可以不写System？
         */
        System.out.println();//如果out是属于System类的，如果将System类中的所有方法都导入进来，就可以不用写System了
        //但是没有java代码会这样写，了解即可。
    }
}
