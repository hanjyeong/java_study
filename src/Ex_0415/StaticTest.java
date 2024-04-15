package Ex_0415;

class Circle5{
    private int radius;
    Circle5(int radius){
        this.radius=radius;}
    public int getRadius(){
        return radius;}
    public void setRadius(int radius){
        this.radius = radius;}
}

class CircleManager { // static 메서드만 존재

    // dest에 src 복사 : radius 복사해주면 됨
    public static void copy(Circle5 src, Circle5 dest) {
        dest.setRadius(src.getRadius());
    }

    // 반지름의 크기가 동일한지 비교하기
    public static boolean equals(Circle5 a, Circle5 b) {
        if (a.getRadius() == b.getRadius()) {return true;} // 같으면 true
        else {return false;}  // 다르면 false 리턴
    }
}

    public class StaticTest {
        public static void main(String[] args) {

            Circle5 pizza = new Circle5(5);
            Circle5 waffle = new Circle5(1);

            boolean res = CircleManager.equals(pizza, waffle); // 반지름의 길이가 다름
            if (res == true) {
                System.out.println("pizza와 waffle 크기 같음"); // 이 부분 출력
            } else {
                System.out.println("pizza와 waffle 크기 다름");

            }

            CircleManager.copy(pizza, waffle); //반지름 복사 -> 반지름 길이 같아짐
            res = CircleManager.equals(pizza, waffle);
            if (res == true) {
                System.out.println("pizza와 waffle 크기 같음"); // 이 부분 출력
            } else {
                System.out.println("pizza와 waffle 크기 다름");

            }
        }

    }





