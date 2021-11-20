import java.util.Arrays;

/**
 * Creat by Liuzong
 * Description:
 * User:
 * Date: 2021-11-05
 * Time: 10:37
 */
public class MyArrayList {
    public int []elem;
    public int usedSized;
    public static int length = 10;

    public MyArrayList() {
        this.elem = new int[length];//这个new出来的数组不在对象中，在堆中新开辟了一块空间
    }
    // 打印顺序表
    public boolean isEmpty () {
        return this.usedSized == 0;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("顺序表为空，当前无数值");
            return;
        }
        for (int i = 0; i < this.usedSized; i++) {
            System.out.print(this.elem[i] + " ");//这里万万不可用' '这样输出的结果会是将ASCII相加
        }
        System.out.println();
    }
    public boolean isFull() {
        return this.usedSized == length;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSized) {
            System.out.println("pos位置不合法");
            return;
        }
        if (isFull()) {
            //顺序表已经满了，需要进行扩增
            int[] elem = Arrays.copyOf(this.elem, 2 * length);
            length *= 2;
        }
//        if (pos >= 0 && pos <= this.usedSized && this.usedSized < length) {
        for (int i = this.usedSized - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSized++;//这一步千万不能忘
//    }
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        if (isEmpty()) {
            System.out.println("当前顺序表为空，无法查找");
            return false;
        }
        for (int i = 0; i < this.usedSized; i++) {
            if (this.elem[i] == toFind){
                return true;
            }
        }
        System.out.println("当前顺序表非空，并且不包含此元素");
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        if (isEmpty()) {
            System.out.println("此顺序表为空,无法进行查找");
            return -1;
        }
        for (int i = 0; i < this.usedSized; i++) {
            if (this.elem[i] == toFind)
                return i;
        }
        System.out.println("当前顺序表非空，查找失败");
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            System.out.println("当前顺序表为空，无法进行获取");
            return -1;
        }
        if (pos < 0 || pos >= this.usedSized) {
            System.out.println("pos位置不合法，建议重新输入");
            return -1;
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (isEmpty()) {
            System.out.println("当前顺序表为空，无法进行pos位置元素的设置");
            return;
        }
        if (pos < 0 || pos >= this.usedSized) {
            System.out.println("pos位置不合法，建议重新输入");
            return;
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (isEmpty()) {
            System.out.println("当前顺序表为空，无法进行删除操作");
            return;
        }
        for (int i = 0; i < this.usedSized; i++) {
            if (this.elem[i] == toRemove) {
                for (int j = i; j < this.usedSized-1; j++) {//这里注意，j只需要走到倒数第二个就可以了再多走会越界
                    this.elem[j] = this.elem[j + 1];
                }
                this.elem[usedSized - 1] = 0;
                this.usedSized--;
                break;
            }
        }
    }
    // 获取顺序表长度
    public int size() {
        return length;
    }
    // 清空顺序表
    public void clear() {
        for (int i = 0; i < length; i++) {
            this.elem[i] = 0;
        }
        this.usedSized = 0;
    }
}
