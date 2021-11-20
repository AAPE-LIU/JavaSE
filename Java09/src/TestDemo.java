/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-05
 * Time: 10:45
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,15);
        myArrayList.add(2,17);
        myArrayList.add(3,12);
        myArrayList.add(4,22);
        myArrayList.add(5,27);
        System.out.println(myArrayList.search(22));
        myArrayList.display();
        System.out.println(myArrayList.contains(18));
        myArrayList.remove(12);
        myArrayList.display();
        System.out.println(myArrayList.usedSized);
    }

}
