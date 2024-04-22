package Ex_0422;

class SuperObject{ // 슈퍼클래스
    protected  String name;

    public void draw(){
        System.out.println("Super");
    }
    public void paint(){draw();}

}
public class SubObject extends SuperObject{
    protected String name;

    @Override // 오버라이딩 함수
    public void draw(){

        name = "Sub";
        super.name = "Super";
        super.draw(); // 정적 바인딩
        System.out.println(name); // 동적 바인딩
    }

    public static void main(String[] args) {
        SuperObject b = new SubObject(); // 업 캐스팅
        b.paint();
    }
}
