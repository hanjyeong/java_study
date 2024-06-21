package Ex_0513;

class Point{
    private int x, y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override // toString() 기본내용: 클래스이름@해시코드
    public String toString(){ // Object클래스의 toString() 메소드 오버라이딩
        return "Point (" + x + "," + y + ")";
    }
    @Override // Obj클래스의 기본 메서드 equals 오버라이딩
    public boolean equals(Object obj){ // 업 캐스팅
        Point b = (Point) obj; //다운 캐스팅
        if(x ==b.x && y==b.y){return true;}
        else return false;
    }

}
public class ToStringEx {
    public static void main(String[] args) {
        Point a = new Point(2, 3);

        System.out.println(a.getClass().getName()); // 클래스 이름
        System.out.println(a.hashCode());
        System.out.println(a.toString());
        System.out.println(a); // a는 a.toString()으로 자동 변환됨

        Point b = new Point(2, 3);
        System.out.println("a와 b를 비교 = "+a.equals(b)); // 한지형
    }
}
