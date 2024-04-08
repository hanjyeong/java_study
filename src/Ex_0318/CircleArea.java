package Ex_0318;

public class CircleArea {

    // final 선언
    public static final double PI = 3.14; // 원주율을 상수로 선언

    public static void main(String[] args) {

        double radius = 10.2;          // 원의 반지름
        double circleArea = radius * radius * PI; // 원의 면적 계산

        System.out.println("반지름 = " + radius);
        System.out.println("원의면적 = " + circleArea);

    }
}
