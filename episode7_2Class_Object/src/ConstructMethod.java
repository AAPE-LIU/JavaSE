class Person3{
    private String name;
    private int age;
    /*==================================*/
    public Person3(){
        this("liuzong",22);
        System.out.println("调用不带参数的构造方法");
    }
    public Person3(String name){
        this.name = name;  //this 代表的是当前对象的引用
        System.out.println("带一个参数的构造方法");
    }
    public Person3(String name, int age){
        System.out.println("带两个参数的构造方法");
    }
    /*======================================*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /*======================================*/

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ConstructMethod {
    public static void main(String[] args) {
        Person3 person31 = new Person3("bigbang");
        System.out.println(person31.getName());
        System.out.println("================================");

        Person3 person3 = new Person3();
        System.out.println(person3.toString());
    }
}
