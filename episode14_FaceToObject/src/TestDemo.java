// ctrl + o 快捷键调出重写方法
// 多态发生的条件：1.向上转型  2.有方法的重写

class Shape{
    public void draw(){

    }
}
class Circle extends Shape{
    @Override
    public void draw() {  // 重写快捷键 CTRL + O
        System.out.println("画一个圆圈⭕");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("打印一个方形♦");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("打印❀");
    }
}
public class TestDemo {
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        drawShape(circle);

        Rect rect = new Rect();
        drawShape(rect);

        Flower flower = new Flower();
        drawShape(flower);
    }
}
