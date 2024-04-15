package Ex_0415;

class Point2{
    private int x,y;

    public Point2(){
        this.x=0; this.y=0;
    }
    public Point2(int x, int y){
        this.x=x; this.y=y;
    }
    public void set(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint2 extends Point2{ //Point 를 상속받은 ColorPoint
    private String color; //점의 색

    public ColorPoint2(int x,int y,String color){
        super(x,y); // 부모 생성자를 호출하여 초기화
        this.color=color;
    }

    public ColorPoint2(){
        this.color = "White";
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint(); // Point의 showPoint 호출
    }
}
public class ColorPointEx {
    public static void main(String[] args) {

        ColorPoint2 cp = new ColorPoint2(5, 6, "Blue");
        cp.showColorPoint();

        ColorPoint2 cp2 =new ColorPoint2(); // 기본 생성자 호출 -> 부모의 기본 생성자 호출
        cp2.showColorPoint();

    }
}
