package edu.whu.extenddemo;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-11
 * Time: 12:50
 */
class Animal {
    public String name;
    public int age;
    public void eat () {
        System.out.println(name + "吃饭饭");
    }
    public void bark () {
        System.out.println(name + "叫叫叫");
    }
}
class Dog extends Animal{
    /**
     * 关键字extends代表继承，如果继承了某个类，那么父类的基本属性基本方法，这个子类都有
     * 集成的意义就是为了代码的重复使用，而且没有冗余的代码
     */

}
class Cat extends Animal{
    public void uptree () {
        System.out.println(this.name + "上树树");

    }
}
//class Cat extends Animal,Dog {}  //这里是不可以的，因为java中不支持多继承，只支持单继承
//因此为了解决这个问题后面会引入接口相关东西，来实现多继承
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.uptree();
        cat.name = "mimi";
        cat.uptree();
        Dog dog = new Dog();
        dog.name = "keji";
        dog.bark();
        dog.eat();
    }

}
