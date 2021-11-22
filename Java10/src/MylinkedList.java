/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-06
 * Time: 9:31
 */

/**
 * 首先要构造结点，节点包含什么？其次要构造自己的链表，构成自己的链表需要什么？
 */
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MylinkedList {
    public Node head;
    public Node cursor;
    public Node head2;
    public void createList () {//这种是穷举的方法，很low，但主要就是要理解这其中的原理
        Node node1 = new Node(1);//node1是一个引用，他里面存放的是地址，是一个Node类型的数据的地址
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        this.head = node1;//创建一个链表的时候，要将头指针给安排上。
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
    public void createCycleList () {//这种是穷举的方法，很low，但主要就是要理解这其中的原理
        Node node1 = new Node(1);//node1是一个引用，他里面存放的是地址，是一个Node类型的数据的地址
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(10);
        this.head2 = node1;//创建一个链表的时候，要将头指针给安排上。
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
    }
    public void show () {
        /**
         * 当需要把列表遍历完的时候要用 this.cursor != null ,
         * 当需要找到尾节点的时候，只需要 this.cursor.next != null
         */
        this.cursor = this.head;
        while (this.cursor != null) {
            System.out.print(this.cursor.val + " ");
            this.cursor = this.cursor.next;
        }
        System.out.println();
    }
    public void show2 (Node head3) {
        /**
         * 当需要把列表遍历完的时候要用 this.cursor != null ,
         * 当需要找到尾节点的时候，只需要 this.cursor.next != null
         */
        this.cursor = head3;
        while (this.cursor != null) {
            System.out.print(this.cursor.val + " ");
            this.cursor = this.cursor.next;
        }
        System.out.println();
    }
    //头插法
    public void addFirst(int data){
        Node node5 = new Node(data);
        node5.next = head;
        head = node5;
    }
    // 尾插法
    public void addLast(int data){
        Node node6 = new Node(data);
        if (this.head == null) {
            this.head = node6;
        }else {
            this.cursor = this.head;
            while(this.cursor.next != null) {
                this.cursor = this.cursor.next;
            }
            this.cursor.next = node6;
            this.cursor = node6;
        }
    }
    //任意位置插入,第一个数据节点为0号下标2
    public boolean addIndex(int index,int data){
        if (index > this.size() || index <0) {
            System.out.println("dindex输入有误");
            return false;
        }
        if (index == 0) {
            this.addFirst(data);
            return true;
        }
        Node node7 = new Node(data);//当有新的节点要生成的时候就实例化一个Node类型的变量
        this.cursor = this.head;
        for (int i = 0; i < index-1; i++) {
            this.cursor = this.cursor.next;
        }
        node7.next = this.cursor.next;
        this.cursor.next = node7;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        this.cursor = this.head;
        while (this.cursor != null) {
            if (this.cursor.val == key) {
                return true;
            }else{
                this.cursor = this.cursor.next;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        this.cursor = this.head;
        int i = 1;
        if (cursor.val == key) {
            head = head.next;
            /**这样不会导致内存的浪费吗？不会！因为没有人引用她的时候，
             * 它会自动被释放掉
             */
        }
        while (this.cursor.next != null) {
            if (this.cursor.next.val == key){
                this.cursor.next = this.cursor.next.next;
                return;
            }
            this.cursor = this.cursor.next;
        }
        System.out.println("没有找到此元素，删除失败");
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        while (this.head.val == key) {
            this.head = this.head.next;//这里用来删除所有的与关键字相同的头节点
            /**
             * 这里要声明，如果是要修改前后连接关系的话，本质是需要修改next值
             * 不管你定义的Node类型的名字是什么，能达到修改的目的就行
             * 但是这里，是修改头指针的指向，所以不能用cursor代替，只能用head，
             * 因为show()函数使用的就是cursor = head；
             */
        }
        this.cursor = this.head;
        while (this.cursor.next != null) {
            /**
             * 这里是利用 找前结点 的方法进行删除
             */
            if (this.cursor.next.val == key) {
                this.cursor.next = this.cursor.next.next;
            }else {
                this.cursor = this.cursor.next;
            }
        }
    }
    public void removeAllKey2 (int key) {
        /**
         * 这种方法的思想就是设置一个指向遍历关键字节点前面一个节点的引用，然后
         * 让遍历的那个游标去找包含关键字的节点，然后pre用来删除该节点
         */
        Node pre;
        Node cursor;
        while (this.head.val == key) {
            head = head.next;
        }
        pre = this.head;
        cursor = this.head.next;
        while (cursor != null) {
            if (cursor.val == key) {
                cursor = cursor.next;
            }else {
                pre.next = cursor;
                pre = cursor;
                cursor = cursor.next;
            }
        }
        pre.next = cursor;//遍历到最后，如果最后一个元素是关键字的话，上面的代码不会
        //进行删除，因此这里加一行代码，即使最后一个不是关键字，也不影响结果

    }
    //得到单链表的长度
    public int size() {
        this.cursor = this.head;
        int count = 0;
        while (this.cursor != null) {
            count++;
            this.cursor = this.cursor.next;
        }
        return count;
    }
    public void clear() {
        Node curNext;
        while(this.head != null) {
            curNext = head.next;
            head = curNext;
        }
    }
    public void reverse () {
//        Node flag;
//        Node pre;
//        flag = head;
//        pre = head;
//        cursor = head.next;
//        while (flag.next != null) {
//            while (this.cursor.next != null) {
//                this.cursor = this.cursor.next;
//                pre = pre.next;
//            }
//            this.cursor.next = this.head;
//            pre.next = null;
//            this.head = this.cursor;
//            pre = head;
//            cursor = head.next;
//        }
        /**
         * 头插法逆置单链表，单链表的逆置
         */
//        Node cursor;
//        cursor = head;
//        while(cursor != null) {
//            head.next = cursor.next.next;
//            cursor.next = head;
//            head = cursor;
//        }
        if (head == null) {
            System.out.println("这是一个空链表，无需反转");
            return;
        }
        if (this.size() == 1) {
            System.out.println("链表内置有一个元素，无需反转");
            return;
        }
        Node cur;
        Node curNext;
        Node pre = null;
        cur = this.head;
        curNext = this.head.next;//将进行遍历的的引用全都初始化
        while (curNext != null){
            cur.next = pre;
            pre = cur;
            cur = curNext;
            curNext = curNext.next;
        }
        cur.next = pre;
        head = cur;
    }
    public Node midNode() {
        /**
         * 返回链表的中间节点，如果有两个中间节点，则返回第二个中间节点
         * 其实思想也是基于快慢指针
         */
        Node fast = this.head;
        Node slow = this.head;
        int i = 0;
        while(true) {
            i++;
            if (i%2 == 0 ) {
                slow = slow.next;
            }
            fast = fast.next;
            if (i % 2 == 0 && fast.next == null || fast == null) {
                break;
            }

        }
        return slow;
    }
    public Node midNode2() {
        /**
         * 返回链表的中间节点，如果有两个中间节点，则返回第二个中间节点
         * 其实思想也是基于快慢指针
         */
        Node fast = this.head;
        Node slow = this.head;
        while (fast.next != null && fast != null) {
            fast =fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node noK(int k) {
        /**
         * 返回倒数第k个节点
         */
        Node forword = this.head;
        Node latter = this.head;
        int i = 0;
        if (k < 1){
            System.out.println("输入有误请重新输入");
            return null;
        }
        while(forword != null) {
            i++;
            if (i > k) {
                latter=latter.next;
            }
            forword = forword.next;
        }
        if(i<k) {//当k大于链表长度的时候，用来处理异常的代码
            return null;
        }else {
            return latter;
        }
    }

    public Node split(int num) {
        /**
         * 给出一个数字，将原有单链表分为两部分，左边是小于该数字的，右边是大于该数字的
         * 并且不改变原有数字的相对顺序
         */
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        while (cur != null){
            if (cur.val < num) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {//万一链表中全部的数字，都大于给定的数字呢？就要用这种措施来应对这种特殊现象
            head = as;
            bs = as;
        }else {
            head = bs;
            be.next = as;
            ae.next = null;
        }
        return bs;
//        be.next = as;
//        head = bs;
//        ae.next = null;
        /**这一步千万不能少，因为在插入过程中有可能将最后一个节点的空next域
         * 指向其他对象，这样的话，新生成的链表就没有结尾的节点了，就成了一个死循环
         * 因此要将最后一个节点的next域手动设置成空80
         *
         */

    }

    public boolean chkPalindrom () {
        /**
         * 判断一个链表是否为一个回文链表，如果是返回true，否则返回false
         * 12321，123321，4567654，这种正着读反着读都一样的称为回文数字
         */
        if(this.head == null || this.head.next == null) {
            return true;
        }
        //1.找中间节点
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2.将链表翻转
        Node pre = slow;
        Node cur = pre.next;
        while (cur != null) {
            Node curnext = cur.next;//先把cur的next记下来，防止接下来改完之后找不到next了
            cur.next = pre;
            pre = cur;
            cur = curnext;
        }
        while (pre != head) {
            if (head.next == slow) {
                return true;
            }
            if (pre.val == head.val) {
                pre = pre.next;
                head = head.next;
            }else {
                return false;
            }
        }
        return true;
    }
    public boolean hasCycle () {
        /**
         * 判断链表是否有环，用快慢指针的原理，如果有环的话，肯定会相遇，但是如果步幅设置的比较大
         * 一方面相遇时间会大大增加，另一方面有可能会永远不相遇，因此步幅设置为 1和 2.
         */
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public Node findCycleStart () {
        /**
         * 首先要找到快指针和慢指针相遇的那个点
         * 然后将慢指针重置到head位置
         * 快指针也变为慢指针的速度
         * 在进行一次遍历，两者相遇的那个点就是链表环的入口
         */
        //默认是有环的，就不用判断是否有环了
        Node fast = this.head2;
        Node slow = this.head2;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        slow = this.head2;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
