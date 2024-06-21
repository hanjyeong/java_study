package Ex_0422;

interface PhoneInterface{ //인터페이스 선언
    int TIMEOUT=10000; //상수 필드 선언
    void sendCall();  // 추상 메서드
    void receiveCall(); // 추상 메서드
    default void printLogo(){ //default 메서드
        System.out.println("**Phone**");
    } // 디폴트 메서드

}
class SamsungPhone implements PhoneInterface{

    //인터페이스 메서드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다");
    }
    // 메서드 추가 작성
    public void falsh(){
        System.out.println("전화기에 불이 켜졌습니다");
    }


}
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone= new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.falsh();
    }
}
