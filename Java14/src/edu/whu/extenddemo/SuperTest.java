package edu.whu.extenddemo;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-12
 * Time: 10:43
 */
class Animal1 {
    public String name;
    public int age;
    public void eat () {
        System.out.println(name + "吃饭饭");
    }
    public void bark () {
        System.out.println(name + "叫叫叫");
    }
    public Animal1 (String name) {
        this.name = name;
    }
}
class Dog1 extends Animal1{
    /**
     * 关键字extends代表继承，如果继承了某个类，那么父类的基本属性基本方法，这个子类都有
     * 集成的意义就是为了代码的重复使用，而且没有冗余的代码
     */
    public Dog1(String name) {
        super(name);
    }
    public void dogEat () {
        System.out.println(this.name + "吃粑粑");
    }
}
class Cat1 extends Animal1{
    /**
     * 牢记一句话，当要构造子类的对象的时候一定要要求父类的对象要有，要存在，因此要先将父类对象构造出来
     */
    public void uptree () {
        System.out.println(this.name + "上树树");
    }
    public Cat1(String name) {
        super(name);//显示地调用Animal1的构造方法，当下面那个大括号执行完之后Cat对象完成构造
                    //但在那之前，必须要将父类也就是Animal1给构造出来，就利用super进行构造
        //这个地方也可以摁alt + insert来快捷创建
    }
}
public class SuperTest {

    protected int size;
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1("hahah");//如果Animal1中没有指定该类的构造方法，那么默认会有一个
        //不带参数的构造方法，因此默认都会有一段代码将构造函数隐式地构造出来
        /**
         * 但是如果父类中显示的写了构造方法，如果不对继承他的子类进行对应的代码处理就会报错。。
         */
        Cat1 cat1 = new Cat1("mia ou");
        cat1.eat();
        Dog1 dog1 = new Dog1("二哈");
        dog1.dogEat();
    }
}
