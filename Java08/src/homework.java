import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.Scanner;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-04
 * Time: 0:34
 */
class MyValue {
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyValue{" +
                "num=" + this.num +
                '}';
    }
}
class Value {
    public int val;
}
class Construct {
    /**
     * 写一个包含好几种构造函数的类
     * 比呢姑且通过构造函数实例化对象
     */
    public int age;
    private String name;
    private int a;

    public Construct(int age, int a) {
        this.age = age;
        this.a = a;
    }

    public Construct(int age) {
        this.age = age;
    }

    public Construct(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String toString() {
        return "Construct{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
class Calculator {
    public int num1;
    public int num2;
    public int sum() {
        int sum = 0;
        sum = this.num1 + this.num2;
        return sum;
    }
    public int sub() {
        int res = 0;
        res = this.num1 - this.num2;
        return res;
    }
    public int mul() {
        return this.num1*this.num2;
    }
    public double div() {
        return (double) this.num1 / (double) this.num2;
    }
}
public class homework {
    public static void swap2 (MyValue myVal1,MyValue myVal2) {//这里传入参数的类型要注意一下
        int tmp = myVal1.getNum();
        myVal1.setNum(myVal2.getNum());
        myVal2.setNum(tmp);
    }
    public static void main(String[] args) {
        /**
         * private类型的成员变量，进行数据的交换。
         */
        MyValue myValue1 = new MyValue();
        myValue1.setNum(10);
        MyValue myValue2 = new MyValue();
        myValue2.setNum(20);
        System.out.println(myValue1);//类中定义了toString方法，这样才是直接输出，而不是调用toString
        System.out.println(myValue2);
        swap2(myValue1,myValue2);
        System.out.println(myValue1);
        System.out.println(myValue2);

    }
    public static void swap (Value myval1,Value myval2) {
        int tmp = myval1.val;
        myval1.val = myval2.val;
        myval2.val = tmp;
    }
    public static void main3(String[] args) {
        /**
         * 实现两个数的交换
         */
        Value myValue1 = new Value();
        Value myValue2 = new Value();
        myValue1.val = 10;
        myValue2.val = 20;
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
        swap(myValue1,myValue2);
        System.out.println("=========================");
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
    }
    public static void main2(String[] args) {
        /**
         * 设计一个包含多个构造函数的类，并分别用这些构造函数来实例化对象
         */
        Construct construct = new Construct("liuzong",2);
        System.out.println(construct);
    }
    public static void main1(String[] args) {
        /**
         * 编写一个Calculator，有两个属性num1和num2这两个数据的值，不能在定义的同时初始化
         * 最后实现加减乘除四种运算
         */
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        calculator.num1 = scanner.nextInt();
        calculator.num2 = scanner.nextInt();
        System.out.println("求两数之和" + calculator.sum());
        System.out.println("求两数之差" + calculator.sub());
        System.out.println("求两数之积" + calculator.mul());
        System.out.println("求两数之商" + calculator.div());
    }
}
