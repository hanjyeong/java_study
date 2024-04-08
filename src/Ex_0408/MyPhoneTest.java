package Ex_0408;

import java.util.Scanner;

class MyPhone{
    private int year;
    private int vol;

    public void show(){
        System.out.print("출시년도: "+year);
    }
    public void volUp(){
        this.vol+=10;
    }
    public void volDown(){
        this.vol-=10;
    }
    public MyPhone(){year=2023;vol=10;}
    public MyPhone(int year,int vol){
        this.year=year;
        this.vol=vol;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }


}
public class MyPhoneTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year,vol;


       /* System.out.print("폰 정보 입력(출시년도,볼륨)>>");
        MyPhone p1 =new MyPhone(sc.nextInt(),sc.nextInt());


        System.out.print("폰 정보 입력(출시년도,볼륨)>>");
        MyPhone p2=new MyPhone(sc.nextInt(),sc.nextInt());

        p2.volUp();
        System.out.println("==폰 정보 목록==");
        System.out.print("1)");  p1.show(); System.out.println("볼륨"+p1.getVol());
        System.out.print("2)");  p2.show(); System.out.println("볼륨"+p2.getVol());
*/
        MyPhone[] arr= new MyPhone[2]; // 객체 배열 선언

        for(int i=0;i< arr.length;i++){
            System.out.print("폰 정보 입력(출시년도,볼륨)>>");
            arr[i]=new MyPhone(sc.nextInt(), sc.nextInt()); // 객체 배열이므로 각각의 생성자 호출
        }

        System.out.println("==폰 정보 목록==");
        for(int i=0;i< arr.length;i++){
            System.out.print((i+1)+")"); arr[i].show();
            if(i==1) {arr[i].volUp();} // 두번째 값 vol증가
            System.out.println(" 볼륨"+arr[i].getVol());
        }








    }
}
