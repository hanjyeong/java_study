package Ex_0318.연습문제;

import java.util.Scanner;

public class ch2_Ex10 {

    public static void main(String[] args) {

        System.out.print("커피를 주문하세요>>");
        Scanner sc = new Scanner(System.in);
        String coffee = sc.next();
        int num= sc.nextInt();
        //22017100 한지형

        switch (coffee){

            case "에스프레소":

                if(num>=10){

                    System.out.println(2000*num*0.95+"원 입니다");
                }
                else{
                    System.out.println(2000*num+"원 입니다.");
                }
                break;

            case "아메리카노":
                System.out.println(2500*num+"원 입니다.");
                break;
            case "카푸치노":
                System.out.println(3000*num+"원 입니다.");
                break;
            case "카페라떼":
                System.out.println(3500*num+"원 입니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다");
        }
    }
}
