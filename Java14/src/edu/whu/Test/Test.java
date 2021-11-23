package edu.whu.Test;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-12
 * Time: 17:02
 */
class A {
    public int a = 10;
}
class Base extends A{
    public int a = 1;
    public int b = 2;
}
class Derive extends Base{
    public int a = 3;
    public void func () {
        /**
         * 子类和父类变量重名的解决办法
         */
        System.out.println("调用了fun()方法");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);//并且super只会调用最直接的父类，并不会调用他的爷爷类
    }
}
public class Test {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.func();
    }
}
