public class MyList {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addLast(1);
        myLinkList.addLast(2);
        myLinkList.addLast(3);
        myLinkList.addLast(2);
        myLinkList.addLast(4);
        myLinkList.addLast(2);
        myLinkList.display();
        myLinkList.removeAllKey2(2);
        System.out.println("=================================");
        myLinkList.display();
    }
}
