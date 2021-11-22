/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-09
 * Time: 20:27
 */
class NodeD {
    public int data;
    public NodeD next;
    public NodeD pre;

    public NodeD(int data) {
        this.data = data;
    }
}
public class MyRealLinkedList {
    public NodeD head;
    public NodeD last;
    //头插法
    public void addFirst(int data) {
        NodeD nodeD = new NodeD(data);
        if (this.head == null) {
            this.head = nodeD;
            this.last = nodeD;
        }
        else {
            this.head.pre = nodeD;
            nodeD.next = this.head;
            this.head = nodeD;
        }
    }


    //尾插法
    public void addLast(int data) {
        NodeD nodeD = new NodeD(data);
        if (this.last == null) {
            this.last = nodeD;
            this.head = nodeD;
        } else {
          this.last.next = nodeD;
          nodeD.pre = this.last;
          this.last = nodeD;
        }
    }


    // 任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        NodeD nodeD = new NodeD(data);
        if (index < 0 || index > size()) {
            System.out.println("你输入的下标有误，请重新输入");
            return false;
        }
        if (index == 0) {
            this.head.pre = nodeD;
            nodeD.next = this.head;
            this.head = nodeD;
        }
        if (index == size()) {
            this.last.next = nodeD;
            nodeD.pre = this.last;
            this.last = nodeD;
        }
        int length = 0;
        NodeD cur = this.head;
        while(length < index-1) {
            cur = cur.next;
            length++;
        }
        nodeD.next = cur.next;
        cur.next.pre = nodeD;
        cur.next = nodeD;
        nodeD.pre = cur;
        return true;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        NodeD cur = this.head;
        if (cur == null) {
            System.out.println("双向链表是空链表，没有此元素");
            return false;
        }
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("这是一个空链表无需删除操作");
            return;
        }
        NodeD cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.last) {
                    this.last = cur.pre;
                    if (this.last == null) {//防止出现只有一个节点的情况
                        this.head = null;
                        return;
                    }else {
                         cur.pre.next = null;
                        cur.pre = null;
                        return;
                    }
                }
                if (cur == this.head){
                    this.head = cur.next;
                    if (this.head == null) {//防止只有一个结点的情况
                        this.last = null;
                        return ;
                    }
                    else{
                        cur.next.pre = null;
                        cur.next = null;
                        cur.pre = null;
                        return;
                    }

                }
                cur.pre.next = cur.next;
                cur.next.pre = cur.pre;
                return;
            }
            cur = cur.next;
        }
        System.out.println("不存在关键字为" + key + "的节点");
        return;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }


    //得到单链表的长度
    public int size() {
        NodeD cur = this.head;
        if (cur == null) {
            return 0;
        }
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            length ++;
        }
        return length;
    }
    public void display(NodeD head1) {
        NodeD head2 = head1;
        if (head2 == null) {
            System.out.println("空链表没有什么可以显示的");
            return;
        }
        while (head2 != null) {
            System.out.print(head2.data + " ");
            head2 = head2.next;
        }
        System.out.println();
    }


    public void clear() {

    }
}
