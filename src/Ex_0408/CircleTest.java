package Ex_0408;

class Circle{
    int radius;
    String name;
    public Circle(){
        radius=1; //radius의 초기값은 1
        name=" ";
    }
    public Circle(int r, String n){
        radius=r; name=n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {

        Circle pizza = new Circle(10, "자바피자"); //매개변수 생성자호출
        double area= pizza.getArea();
        System.out.println(pizza.name+"의 면적은 " + area);

        Circle donut = new Circle(); // 기본생성자 호출
        donut.name = "도넛피자";
        area= donut.getArea();
        System.out.println(donut.name+"의 면적은 " + area);

    }
}
