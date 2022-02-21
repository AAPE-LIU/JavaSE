class Node {
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
        int len = 0;
        Node cur = head;
        while (cur != null){
            len ++;
            cur = cur.next;
        }
        return len;
    }

    /**
     * 打印单链表中的元素
     */
    public void display(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public void display2(Node head2){
        Node cur = head2;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public void clear(){
        head = null;
    }
    /**
     * 逆置单链表
     */
    public void reverseLinkList(){
        if (head == null){
            return;
        }
        Node cur = head.next;
        Node sign = head;
        while(cur != null){
            head.next = cur.next;
            cur.next = sign;
            sign = cur;
            cur = head.next;
        }
        head = sign;

    }
    /**
     * 返回链表的中间结点,如果有两个中间节点，则返回右边的
     */
    public Node midNode(){
        if (head == null){return head;}
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    /**
     * 找出链表中倒数第 k 个元素
     */
    public Node lastButK(int k){
        int len = size();
        if (k <= 0 || k > len){
            System.out.println("你这个输入的不合法呀！");
            return null;
        }
        if (head == null){
            System.out.println("此链表为空，倒数第" + k + "个节点不合法");
            return null;
        }
        Node pre = head;
        Node aft = head;
        int i = 0;
        while(pre != null){
            pre = pre.next;
            if (i>k-1){
                aft = aft.next;
            }
            i++;
        }
        return aft;
    }
    /**
     * 合并两个有序链表为一个新的有序链表
     */
    public Node mergeLinkList(Node list1, Node list2){
        Node newHead;
        Node cur;
        if (list1 == null && list2 == null){return null;}
        if (list1 == null){return list2;}
        if (list2 == null){return list1;}
        if (list1.val < list2.val){
            newHead= list1;
            cur = list1;
            list1 = list1.next;
        }else {
            newHead= list2;
            cur = list2;
            list2 = list2.next;
        }
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                cur.next = list1;
                cur = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                cur = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null){
            cur.next = list1;
        }
        if (list2 != null){
            cur.next = list2;
        }
        return newHead;
    }
    /**
     * 分割链表，将链表根据给定的数值分开，左边是小于该数值的元素，右边是大于该数值的元素
     * 并且分隔开之后不改变原有的相对顺序
     */
    public Node splitLinkList(int x){
        Node cur = head;
        Node pre_head = null;
        Node pre_tail = null;
        Node aft_head = null;
        Node aft_tail = null;
        while (cur != null){
            if (cur.val < x){
                if (pre_head == null){
                    pre_head = cur;
                    pre_tail = cur;
                }else {
                    pre_tail.next = cur;
                    pre_tail = pre_tail.next;
                }
            }else {
                if (aft_head == null){
                    aft_tail = cur;
                    aft_head = cur;
                }else {
                    aft_tail.next = cur;
                    aft_tail = aft_tail.next;
                }
            }
            cur = cur.next;
        }
        if (pre_tail != null) {
            pre_tail.next = null;
            if (aft_tail != null){
                aft_tail.next = null;
            }
            pre_tail.next = aft_head;
            return pre_head;
        }else {
            return head;
        }
    }
    /**
     * 删除有序链表中重复的节点，只要是重复出现的就全部删除掉
     */
    public Node delNode(){
        Node nhead = new Node(-1);
        Node cur = this.head;
        Node tmpHead = nhead;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                while (cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;  // 多走一步，将重复的部分跨掉
            }else {
                tmpHead.next = cur;
                tmpHead = tmpHead.next;
                cur = cur.next;
            }
        }
        tmpHead.next = null;
        head = nhead.next;
        return head;
    }
    /**
     * 判断链表是否是回文结构
     * 1.找中间结构
     * 2.反转
     * 3.一前一后判断是否相等
     */
    public boolean backWord(){
        /**
         * 找中间节点
         */
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        /**
         * 反转后面的链表
         * 技巧：画出来草图会更好做一些
         */
        Node sign = slow;
        Node cur = slow.next;
        while (cur != null){
            slow.next = cur.next;
            cur.next = sign;
            sign = cur;
            cur = slow.next;
        }
        slow = sign;
        /**
         * 判断是否是回文链表
         */
        Node cur1 = head;
        Node cur2 = slow;
        while(cur1 != null && cur2 != null){
            if (cur1.val == cur2.val){
                cur1 = cur1.next;
                cur2 = cur2.next;
            }else {
                return false;
            }
        }
        return true;
    }
    /**
     * 判断一个链表是否有环
     */
    public boolean existCircle(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    /**
     * 找出环的入口
     */
    public Node detectCycleEntrey(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    /**
     * 判断两个链表是否有公共节点
     */
    public Node commonNode(Node headA,Node headB){
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        int len = 0;
        while(pl != null){
            pl = pl.next;
            lenA++;
        }
        while (ps != null){
            ps = ps.next;
            lenB++;
        }
        len = lenB - lenA;
        if (len < 0){
            ps = headA;
            pl = headB;
            len = lenA - lenB;
        }
        while (len != 0){
            ps = ps.next;
            len--;
        }
        while (ps != pl && ps != null && pl != null){
            ps = ps.next;
            pl = pl.next;
        }
        if (ps == null || pl == null){
            return null;
        }else {
            return ps;
        }
    }

}

