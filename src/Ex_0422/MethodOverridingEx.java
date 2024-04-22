package Ex_0422;

class Shape{ //슈퍼클래스
    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {

    public static void paint(Shape p){ // 업캐스팅
        p.draw(); //동적 바인딩
    }
    public static void main(String[] args) { // 한지형

        Line line = new Line();
        paint(line);

        paint(new Shape()); //Shape의 draw
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
