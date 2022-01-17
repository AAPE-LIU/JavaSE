/*====================================================================*/
class Person{
    //属性，成员变量 -> 指定义在类中方法外的变量
    public int age;
    public String name;
    public char ch;
    public static int size; //静态成员变量
    public static String location;
    public static final int SIZE = 10;//静态常量，存在于方法区中
    public final int SIZE2 = 20; //常量，仍然存在于对象中
    // 变量存在于实例化出来的对象中还是方法区中，跟final没有关系，只跟static有关系

    //行为 -> 成员方法
    public void eat(){
        int a = 10;
        System.out.println("吃饭，成员方法");
    }
    public static void sleep(){
        System.out.println("我要睡觉");
    }
    public void show(){
        eat();//这里是可以调用eat方法的
        func();//这里可以调用func方法，但是func方法不能调用show方法
        System.out.println("年龄:" + age + " " + "姓名:" + "name");
    }
    public static void func(){
//        eat();//但是这里不能调用，如果把eat加上static就可以调用了，这也是为什么之前
        // 在写方法的时候都要加上static的原因，因为在psvm中调用的时候，那些方法必须要有static，不然没办法调用
        // 如果不直接调用的话，就要实例化该对象，然后通过该对象进行调用方法

        /*========================================================*/
        //总的来说就是，包含static的可以直接用类进行调用，或者就是可以在类中直接调用
        //而不包含static的则需要通过实例化对象，然后再进行调用
        /*========================================================*/
        System.out.println("这是一个静态成员方法");
    }

    // 功能和show一样是用来展示 类中的成员变量的
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ch=" + ch +
                '}';
    }
}

/*====================================================================*/

class TestDemo{
    public int a;
    public static int count;
}

/*====================================================================*/

public class Class_Object {
    /**
     * 静态成员变量和普通成员变量运算时的差别
     * @param args
     */
    public static void main(String[] args) {
        TestDemo t1 = new TestDemo();
        t1.a++;
        TestDemo.count++;
        System.out.println(t1.a);// 1
        System.out.println(TestDemo.count);// 1
        System.out.println("============");
        TestDemo t2 = new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println(t2.a);// 1
        System.out.println(TestDemo.count);// 2
    }
    public static void main2(String[] args) {
        Person person = new Person();
        System.out.println(person.size);//访问静态成员变量，通过实例化出来的对象去访问，不合理，但是可用
        System.out.println(Person.size);//访问静态成员变量，通过类名直接去访问，合理且合法
        Person.sleep();  //访问规则同上
        person.sleep();  //访问规则同上
    }
    public static void main1(String[] args) {
        Person person = new Person();//Person虽说叫做类，但是他其实全称是类型。
        //person是一个引用变量，他里面存的是一块内存地址
        //一个类可以实例化多个对象，就像一张图纸，可以造出无数所房子
        person.age = 20;
        person.name = "liuzong";
        person.show();
        System.out.println(person.ch);
        System.out.println(person.toString());
    }
}
