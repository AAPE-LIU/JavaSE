package edu.whu.testdemo;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-11
 * Time: 11:10
 */
public class TestDemo2 {
    protected int age = 22;
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.age);
        System.out.println(testDemo.sex);
//        System.out.println(testDemo.name); 这个就访问不了了，因为name是private修饰的，只能在定义他的类中访问

    }


}
