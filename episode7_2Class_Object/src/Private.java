class Person2{
    private int age;
    private String name;//只要有私有变量就要用public方法去调用他
    // 只要被private修饰，他的权限就被降低了，只能在当前的类中才能直接使用

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Private {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.setAge(20);
        System.out.println(person2.getAge());
        Person2 person21 = new Person2();
        System.out.println(person21.getAge());
    }

}
