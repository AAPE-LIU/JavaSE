public class MyList {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(1);
        myLinkList.addFirst(2);
        myLinkList.addFirst(3);
        myLinkList.addFirst(4);
        myLinkList.addFirst(5);
        myLinkList.addFirst(6);
        myLinkList.display();
        System.out.println("==========================");
        myLinkList.reverseLinkList();
        myLinkList.display();
        System.out.println("==========================");
        Node mid = myLinkList.midNode();
        System.out.println(mid.val);
        System.out.println("==========================");
        Node lastK = myLinkList.lastButK(5);
        System.out.println(lastK.val);
    }
}
