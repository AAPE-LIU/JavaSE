import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedsize;
    private static final int capacity = 10;
    public MyArrayList(){
        this.elem = new int[capacity];
    }
    // 打印顺序表
    public void display() {
        if (usedsize == 0){
            System.out.println("");
        }else {
            for (int i = 0; i < usedsize; i++) {
                System.out.println(this.elem[i]);
            }
//            System.out.println();
//            System.out.println(Arrays.toString(this.elem));
        }
    }
    // 判断是否已满
    public boolean isFull(){
        return this.usedsize == capacity;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > usedsize){
            System.out.println("输入坐标错误，请重新输入");
        } else if (isFull()){
            System.out.println("此顺序表已满");
        }else {
            for (int i = usedsize-1; i >= pos ; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            usedsize += 1;
        }

    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        if (usedsize == 0){
            System.out.println("此列表为空，不需要查找");
            return false;
        }else {
            for (int i = 0; i < usedsize; i++) {
                if (this.elem[i] == toFind){
                    return true;
                }
            }
            return false;
        }
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        if (usedsize == 0){
            System.out.println("此顺序表为空，别查了");
            return -1;
        }else {
            for (int i = 0; i < usedsize; i++) {
                if (this.elem[i] == toFind){
                    return i;
                }
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (usedsize == 0){
            System.out.println("此顺序表为空，别找pos位置元素了");
            return -1;
        }else if (usedsize-1 < pos || pos < 0){
            System.out.println("你输入的位置有问题");
            return -1;
        }else {
            return this.elem[pos];
        }
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (usedsize == 0){
            System.out.println("此顺序表为空，别找pos位置元素了");
        }else if (usedsize-1 < pos || pos < 0){
            System.out.println("你输入的位置有问题");
        }else {
            this.elem[pos] = value;
        }
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (usedsize == 0){
            System.out.println("此顺序表为空，别删了");
        }else {
            for (int i = 0; i < usedsize; i++) {
                if (this.elem[i] == toRemove){
                    if (i == capacity){
                        this.elem[i] = 0;
                        this.usedsize -= 1;
                        System.out.println("删除成功");
                        break;
                    }
                    for (int j = i; j < usedsize; j++) {
                        if (j+1 <= capacity-1){
                            this.elem[j] = this.elem[j+1];
                        }
                    }
                    this.elem[capacity-1] = 0;
                    usedsize -= 1;
                    System.out.println("删除成功");
                    break;
                }
                System.out.println("查找不到该元素");
            }
        }

    }
    // 获取顺序表长度
    public int size() {
        System.out.println(this.usedsize);
        return 0;
    }
    // 清空顺序表
    public void clear() {
        for (int i = 0; i < usedsize; i++) {
            this.elem[i] = 0;
        }
        this.usedsize = 0;
    }
}
