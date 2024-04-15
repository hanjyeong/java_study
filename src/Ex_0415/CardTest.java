package Ex_0415;

import java.util.Scanner;

class Card{
    private String kind; //카드의 무늬
    private int num;  // 카드의 번호

    public static int width=100,height=250; //static 변수

    public Card(){ kind="Spade";num=1;}
    public Card(String kind,int num){
        this.kind=kind;
        this.num = num;
    }
    public void showInfo(){
        System.out.print(kind+" 숫자:"+num); // print? println?
    }
    public void showSize(){
        System.out.println("카드 사이즈: "+width+"X"+height); // print? println?
    }

    public static void setSize(int w,int h){
        System.out.println("=======카드 사이즈 변경!!=======");
        width=w; height=h;
    }
}

public class CardTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("카드 폭은 "+Card.width+" 높이는"+Card.height);

        Card []arr=new Card[2];
        for(int i=0;i< arr.length;i++){
            System.out.print((i+1)+ " 카드의 무늬와 숫자를 입력하세요>>");
            arr[i] = new Card(sc.next(), sc.nextInt());

        }

        for(int i=0;i< arr.length;i++){
            System.out.print("c"+(i+1)+"의 무늬는: "); //'c' ?
            arr[i].showInfo();
            arr[i].showSize();
        }

        Card.setSize(50,80); //setSize로 카드 사이즈 변경
        for(int i=0;i< arr.length;i++){
            System.out.print("c"+(i+1)+"의 무늬는: "); //'c' ?
            arr[i].showInfo(); arr[i].showSize();
        }


    }
}


/*
- 출력결과와 동일하게 출력하기 위해 print 랑 println 주의해서 사용하기
- System.out.print("c"+(i+1)+"의 무늬는: "); //'c' ? 이 코드에서 왜 'c'사용하니깐 아스키 코드 값으로 나오지?
  : 'c'+(i+1) = 문자+숫자로 계산되어서
* */