public class TestDemo {
    public static void main(String[] args) {
        System.out.println(10%3); // 1
        System.out.println(10%-3); // 1
        System.out.println(-10%-3); // -1
        System.out.println(-10%3); // -1
//        short a = 10;
//        short b = 5 + 15;
//        short c = a + 15;
        short a = 10;
        a += 15;
    }
    public static void main5(String[] args) {
        String str = "128";
        int a = Integer.valueOf(str);
        int b = Integer.parseInt(str);
        System.out.println(a+1);

    }
    public static void main4(String[] args) {
        int a = 10;
        long b = 20;
//        a = b;
        a = (int)b;
        System.out.println(a);
        double c = 12.5;
        a = (int)c;
        System.out.println(a);  // 12
    }
    public static void main3(String[] args) {
        String str = "haha";
        int a = 10;
        int b = 20;
        System.out.println(str + a + b);  // haha1020
        System.out.println("haha = " + a + b);  // haha = 1020
        System.out.println(a + b + "haha");  // 30haha
    }
    public static void main2(String[] args) {
        char b = 72;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        int a = 2147483647 + 1;  //-2147483648
        System.out.println(a);
        int c = Integer.MAX_VALUE + 1;  //-2147483648
        System.out.println(c);
    }
    public static void main1(String[] args) {
        long a = 10;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        double b = 1.1;
        System.out.println(b*b);  // 1.2100000000000002
//        使用浮点数的时候尽量使用double类型的
//        float f = 1.25;  //这句话为什么会报错呢？因为1.25默认是double类型的，但是f是定义的float类型的，因此会报错
        float f = 1.25f; // 后面加上一个f就不会报错了，指定他是float类型的
        char name = '刘';
        System.out.println(name);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);



    }
}
