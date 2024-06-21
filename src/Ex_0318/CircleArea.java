package Ex_0318;

public class CircleArea {

    // 상수: public static final 로 선언
    public static final double PI = 3.14;
    // final은 상수변수를 상수로 만드는 키워드 이것을 전체에서 공유해서 사용하기 위해
    //public static 키워드도 같이 사용

    public static void main(String[] args) {

        double radius = 10.2;          // 원의 반지름
        double circleArea = radius * radius * PI; // 원의 면적 계산

        System.out.println("반지름 = " + radius);
        System.out.println("원의면적 = " + circleArea);

    }
}
