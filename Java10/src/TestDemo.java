/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-06
 * Time: 9:30
 */
public class TestDemo {
    public static void main(String[] args) {
        MyRealLinkedList myRealLinkedList = new MyRealLinkedList();
        myRealLinkedList.addFirst(2);
//        myRealLinkedList.addFirst(3);
//        myRealLinkedList.addFirst(4);
//        myRealLinkedList.display(myRealLinkedList.head);
//        System.out.println(myRealLinkedList.contains(3));
//
//        System.out.println("============================");
//        myRealLinkedList.addIndex(2,10);
//        myRealLinkedList.display(myRealLinkedList.head);

        System.out.println("============================");
        myRealLinkedList.remove(2);
        myRealLinkedList.display(myRealLinkedList.head);
    }
    public static Node mergeList (Node headA,Node headB) {
        /**
         * 合并两个有序链表，生成一个新的有序链表。
         */
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                tmp.next = headA;
                headA = headA.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
            }
            tmp = tmp.next;
        }
        if (headA == null) {
            tmp.next = headB;
        }else {
            tmp.next = headA;
        }
        return newHead.next;
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        /**
         *这里使用的是利用两者的长度差来进行判断
         * 其实也可以将链表的尾节点与第二个链表的头节点相接，形成一个环，然后利用找环的入口，求出相交节点
         */
        Node cur1 = headA;
        Node cur2 = headB;
        int lengthA = 0;
        int lengthB = 0;
        if (cur1 == null || cur2 == null) {
            return null;
        }
        while(cur1 != null) {
            cur1 = cur1.next;
            lengthA++;
        }
        while (cur2 != null) {
            cur2 = cur2.next;
            lengthB ++;
        }
        int length = 0;
        if (lengthA > lengthB) {
            length = lengthA - lengthB;
        }else {
            length = lengthB - lengthA;
        }
        cur1 = headA;
        cur2 = headB;
        while (length > 0) {
            if (lengthA > lengthB) {
                cur1 = cur1.next;
                length--;
            }else {
                cur2 = cur2.next;
                length--;
            }
        }
        while (cur1 != cur2 && cur1 != null && cur2 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 == null || cur2 == null) {
            return null;
        }else {
            return cur1;
        }
    }
    public static void createCut (Node headA,Node headB) {
        headA.next.next = headB.next.next;
    }
    public static void main1(String[] args) {
        MylinkedList mylinkedList1 = new MylinkedList();
        mylinkedList1.addLast(1);
        mylinkedList1.addLast(3);
        mylinkedList1.addLast(5);
        mylinkedList1.addLast(7);

        MylinkedList mylinkedList2 = new MylinkedList();
        mylinkedList2.addLast(2);
        mylinkedList2.addLast(4);
        mylinkedList2.addLast(6);
        mylinkedList2.addLast(8);

//        Node ret = mergeList(mylinkedList1.head,mylinkedList2.head);
//        mylinkedList1.show2(ret);

        createCut(mylinkedList1.head,mylinkedList2.head);
        Node ret2 = getIntersectionNode(mylinkedList1.head, mylinkedList2.head);
        System.out.println(ret2.val);


//        mylinkedList.createList();
//        mylinkedList.show();
//        System.out.println(mylinkedList.size());
//
//        System.out.println(mylinkedList.contains(25));
//        System.out.println("===========================");
//
//        mylinkedList.addFirst(1);
//        mylinkedList.addFirst(2);
//        mylinkedList.addFirst(3);
//        mylinkedList.addFirst(4);
//        mylinkedList.show();
//        System.out.println("===========================");

//        mylinkedList.addLast(90);
//        mylinkedList.addLast(55);
//        mylinkedList.addLast(66);
//        mylinkedList.addLast(77);
//        mylinkedList.addLast(90);
//        mylinkedList.show();
//        System.out.println("===========================");
//
//        mylinkedList.addIndex(4,90);
//        mylinkedList.addIndex(14,123);
//        mylinkedList.addIndex(0,90);
//        mylinkedList.show();
//        System.out.println("===========================");
//
//        mylinkedList.remove(123);
//        mylinkedList.show();
//        System.out.println("===========================");
//
//        mylinkedList.removeAllKey2(90);
//        mylinkedList.show();
//        System.out.println("===========================");

//        mylinkedList.clear();
         /**
         * 用ccmd窗口，输入jps ，然后jmap -histo:live java类 前的编码，重定向到指定文件
         */
//        mylinkedList.show();
//        System.out.println("===========================");
//
//        mylinkedList.reverse();
//        mylinkedList.show();
//
//        System.out.println("===========================");
//        Node ret = mylinkedList.midNode();
//        System.out.println(ret.val);
//        Node ret2 = mylinkedList.midNode2();
//        System.out.println(ret2.val);
//
//        System.out.println("===========================");
//        Node ret3 = mylinkedList.noK(11);
//        System.out.println(ret3.val);
//
//        System.out.println("===========================");
//        Node ret4 = mylinkedList.split(40);//25 19 17 12 1 22 11 4 77 66 55
//        mylinkedList.show();
//
//        System.out.println("==========================");
//        System.out.println(mylinkedList.chkPalindrom());

//        System.out.println("==========================");
//        System.out.println(mylinkedList.hasCycle());
//
//        System.out.println("==========================");
//        mylinkedList.createCycleList();
//        System.out.println(mylinkedList.findCycleStart().val);
    }
}
