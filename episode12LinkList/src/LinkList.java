public class LinkList {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addLast(2);
        myLinkList.addLast(6);
        myLinkList.addLast(3);
        myLinkList.addLast(5);
        myLinkList.addLast(6);
        myLinkList.addLast(4);
        myLinkList.addLast(12);
        myLinkList.addLast(8);
        myLinkList.addLast(9);
        myLinkList.addLast(7);
        myLinkList.display();
        System.out.println("==========================");
        Node tmp = myLinkList.splitLinkList(9);
        myLinkList.display2(tmp);
    }
}
