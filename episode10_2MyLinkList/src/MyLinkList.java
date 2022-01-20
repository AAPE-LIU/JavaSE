class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val = val;
    }
}
public class MyLinkList {
    Node head = null;
    Node tail = null;
    public int size = 0;
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            node.next = null;
            this.size += 1;
        }else {
            node.next = head;
            head = node;
            this.size += 1;
        }

    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            this.size += 1;
        }else {
            tail.next = node;
            tail = tail.next;
            this.size += 1;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if (index > this.size || index < 0){
            System.out.println("输入的索引有误");
            return false;
        }
        if (index == 0){
            this.addFirst(data);
            return true;
        }
        if (index == size){
            this.addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        this.size += 1;
        return true;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head;
        while(cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur_pre = head.next;
        Node cur_aft = head;
        if (head.val == key){
            head = head.next;
            return;
        }
        while (cur_pre != null){
            if (cur_pre.val == key){
                cur_aft.next = cur_pre.next;
                return;
            }
            cur_aft = cur_aft.next;
            cur_pre = cur_pre.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey1(int key){
        Node cur_pre = head;
        Node cur_aft = head;
        int i = 0;
        while (head!= null && head.val == key) {
            head = head.next;
            cur_aft = head;
            cur_pre = head;
        }
/*        if (head.val == key && head.next == null){
            head = null;
        }*/
        cur_pre = head.next;
        cur_aft = head;
        while(cur_pre!= null){
            if (cur_pre.val == key){
                cur_pre = cur_pre.next;
            }else {
                cur_aft.next = cur_pre;
                cur_aft = cur_pre;
                cur_pre = cur_pre.next;
            }
        }
        cur_aft.next = cur_pre;
    }
    public void removeAllKey2(int key){
        if (head == null){
            return;
        }
        Node cur_pre = head.next;
        Node cur_aft = head;
        while (cur_pre != null){
            if (cur_pre.val == key){
                cur_aft.next = cur_pre.next;
                cur_pre = cur_pre.next;
            }else {
                cur_aft.next = cur_pre;
                cur_aft = cur_pre;
                cur_pre = cur_pre.next;
            }
        }
        if (this.head.val == key){
            head = head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        return 0;
    }
    public void display(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public void clear(){
        head = null;
    }
}
