package edu.whu.testdemo;

import edu.whu.extenddemo.SuperTest;
import edu.whu.extenddemo.Test;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-11
 * Time: 10:51
 */
public class TestDemo extends SuperTest {
    public int age;  //所有成员都可以访问
    private String name;//只能在这个类当中访问
    String sex; //包访问权限
//    public static void main(String[] args) {
//        System.out.println("这是edu.whu.testdemo");
//    }
    public void func() {
        System.out.println(super.size);//如果在void func()前加上static就会报错了
        //super和this不能在static中使用，因为，他俩需要依赖于对象，而static不依赖于对象
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.size);
        SuperTest superTest = new SuperTest();
//        System.out.println(superTest.size);
// 这种访问方式不可以，而且super不可用于public修饰的方法中
    }

}
class Test1 extends TestDemo2{
    public void jicheng () {
        TestDemo2 testDemo2 = new TestDemo2();
        System.out.println(testDemo2.age);
        /**
         * 如果在这里实例化父类，然后 点 一下父类中的成员变量是可以的，但是上面的属于不同的包中的，就不可以
         * 这样操作，这个属于同一个包中的不同类，因此可以这样使用
         */
    }
}
