import com.sun.deploy.perf.PerfRollup;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-03
 * Time: 3:26
 */

/**
 * 一旦实例化了就可以访问静态的和普通的，但是用实例化出来的对象访问静态的，合法，但是不合理，但是能运行
 * 没有实力胡啊，直接用方法只能访问静态的车官员变量或者静态成员方法
 */
class Person{
    //以下是类的一些属性，也叫做成员变量->定义在类中，方法外的变量，都叫成员变量
    public int age;
    public String name;
    public char ch;
    public boolean bool;
    //静态的不需要实例化也照样可以访问
    //静态成员变量，或者叫做类变量
    public static int count;
    public static  final int size = 10;//依然在方法区中，跟final不final没有关系，只要是静态成员变量，就在方法区中
    private String gender;//private实现封装，其实public和private是表示访问权限控制
    private int score;//被 public 修饰的成员变量或者成员方法, 可以直接被类的调用者使用.
                        // 被 private 修饰的成员变量或者成员方法, 不能被类的调用者使用


    /**
     * 那么为什么要设置private呢？试想类的实现者和调用者，如果全都是用public的话，
     * 调用者想使用成员变量，比如说上面定义的name，age，ch等，那么在调用者写的代码中就会
     * 有很多  对象.变量名  这种形式的访问参数，那么如果类的实现者将变量的名字改了，比如说将name改为了name1
     * 那么类的调用者是不是就得从头开始将所有的name全部修改为name1，因此干脆不让调用者访问类中的具体变量名
     * 直接将他封装起来，这样就相当于对调用者是隐形的，那么调用者该怎么样去给成员变量赋初值呢？或者说如何实现修改
     * 这就要用到getter和setter方法  alt + insert -> Getter and Setter
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;//this 表示当前对象的引用，通过这种方式给变量赋初始值
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    //静态成员方法
    public static void func() {
        System.out.println("func静态成员方法");
//        eat();//func()并不能调用eat()
//        eat();//如果将eat()改成static类型的就可以调用了
        /**
         * 如果就不让eat()加static，还想调用eat()就只能像下面这样做
         * 总而言之，记住，非静态的普通成员 变量/方法 只有经过实例化之后才可以调用
         */
        Person person = new Person();
        person.eat();
    }

    //行为，也叫做成员方法
    public void eat() {
        int a = 10;//这种是局部变量，是在方法的里面定义的，不是成员变量
        System.out.println("我要吃饭饭");
    }
    public void show() {
        System.out.println("name" + ":" + name + " " + "age" + ":" + age);
    }

    /**
     * 重写toString方法
     */
    @Override  //注解，重写的方法，通过摁 alt + insert 然后toString ，选中成员变量，来达到输出的效果
    //这样就不用每一次都自己写一个方法来显示类中的属性了。
    public String toString() {//这里面的内容随便你想怎么写都可以，不一定非要按照这种形式
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ch=" + ch +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * 构造方法的创建
     * 构造方法具有重载性，方法名相同，返回值无所谓，参数不同，调用也会不同
     */
    public Person() {
        System.out.println("没有任何参数的构造方法");
    }
    public Person(int age) {
        this.age = age;
        System.out.println("包含参数age的构造方法");
    }
    public Person (int age,int score) {
        this.age = age;
        this.score = score;
        System.out.println("包含age和score的构造方法");
    }
    //this调用构造函数：this所在的代码行必须要在第一行，会调用到符合this中参数列表的构造方法中去
    //调用完了再继续执行this下面的代码行
    public Person (int age,String name,char ch) {
        this(20,126);//符合条件的是那个包含age和score的构造方法
        this.age = age;
        this.name = name;
        this.ch = ch;
        System.out.println("this方法调用其他构造函数");
    }

    /**
     * 通过construct生成变量的赋值形式
     * alt + insert -> Constructer -> 挑选变量名 ,直接就生成了完整的一个构造函数了
     */
    public Person(int age, String name, char ch, boolean bool) {
        this.age = age;
        this.name = name;
        this.ch = ch;
        this.bool = bool;
    }
}
class Test {
    public int a;
    public static int b;
}
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 对象的  构造方法：
         *一、 实例化一个对象需要两步
         * 1.为对象分配内存
         * 2.提供一个对象的构造方法，每个类中都必须有一个构造方法，如果类中没有自己定义，那么编译器会
         *   默认提供一个不带参数的构造方法
         *二、构造方法的格式：
         * 1.方法名与类名相同
         * 2.不带有任何形式的返回值
         * 三、构造方法的作用
         * 1.构造方法可以用来实例化一个对象
         * 2.构造方法可以对类中的成员变量赋值
         */
        Person person = new Person();//没有任何参数的构造方法
        Person person1 = new Person(22);//包含参数age的构造方法
        System.out.println(person1);//Person{年龄=22, 姓名='null'}
        Person person2 = new Person(18,150);
        System.out.println(person2);
        System.out.println("==============================");
        Person person3 = new Person(23,"liuzong",'A');
        System.out.println(person3);

    }
    public static void main6(String[] args) {
        /**
         * 实现private类型成员变量的赋值与访问
         */
        Person person = new Person();
        person.setGender("male");
        System.out.println("通过Setter赋予的gender值" + person.getGender());
        person.setScore(30);
        System.out.println("通过Setter赋予的score值" + person.getScore());
    }
    public static void main5(String[] args) {
        /**
         * 测试静态成员变量与普通成员变量的数值改变
         */
        Test test1 = new Test();
        Test test2 = new Test();
        test1.a++;
        Test.b++;
        System.out.println(test1.a);
        System.out.println(Test.b);
        System.out.println("===========================");
        test2.a++;
        Test.b++;
        System.out.println(test2.a);
        System.out.println(Test.b);
        /**
         * 为什么会输出这种结果呢？因为静态的成员变量只有一份，是在方法区里面存着
         * 而普通成员变量，存放在堆中，实例化了几个对象，就有几份
         */
    }
    /**
     *静态成员变量与静态成员方法
     */
    public static void main4(String[] args) {
        /**
         * 访问静态成员变量
         */
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.count);//静态成员变量，用person1访问的时候，点，点不出来count
        //但是她也不报错，你运行它还可以运行，只是会有警告
        System.out.println(Person.count);//但是如果我用类名Person直接去，点他，就可以点出来
        /**
         * 本质上是因为，静态成员变量是放在方法区的，可以理解为隶属于类，而不是实例化出来的对象
         * 而普通成员变量都是放在堆中的，隶属于实例化出来的具体对象。
         */

        /**
         * 访问静态成员方法
         */
        Person.func();//同样可以直接 点 出来
        person1.func();//同样也可以用引用类型的实例化出来的对象访问静态成员方法

    }
    public static void main3(String[] args) {
        Person person = new Person();
        System.out.println(person);
        /**
         *println一层一层往下调用，最终调用到toString方法，因此想打印person对象的值，把toString重写成我们需要的样子即可
         */
    }
    public static void main2(String[] args) {
        //当对象中的成员变量没有赋初始值的时候的默认数值是多少？
        /**
         * 如果成员变量没有赋初始值的话，引用类型的默认值为null，基本类型默认为对应的0值
         * boolean类型默认为false，char类型默认为
         */
        Person person = new Person();
        System.out.println(person.name);//String类型的
        System.out.println(person.age);//int类型的
        System.out.println("abvc" + person.ch + "skj");//char类型的
        System.out.println(person.bool);//boolean类型的
    }
    /**
     * 类就是用来描述一个对象的一些特征的
     * 有了类，就可以产生对象了，由类产生对象的过程叫做实例化，怎么实例化呢？
     */
    public static void main1(String[] args) {
        /**
         * 实例化一个对象
         */
        Person person = new Person();
        //类型   引用变量    开内存拿地址
        //其实不用想的那么复杂，就相当于我自己定义了一个Person类型的变量，变量名叫person，
        //开辟好了内存返回一个地址，这个地址赋给person，因此person也是一个引用类型的变量，开辟的地址就是Person类型这么大的空间
        /**
         * 访问普通的成员变量
         * 访问普通的成员变量只需要用对应的引用变量使用 点号 成员变量名就可以完成访问
         * 同样的，访问普通成员方法也是这样
         */
        person.age = 22;
        person.name = "liuzong";
        /**
         * 如下为调用普通成员方法的例子
         */
        person.eat();
        person.show();
        System.out.println(person.toString());
        /**
         * Person只是一个模板，可以创建出来无数个对象
         */
        System.out.println("===========================");
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person abc = new Person();
        abc.name = "wang da chui";
        abc.age = 47;
        abc.eat();
        abc.show();
        System.out.println(abc.toString());
    }
}
