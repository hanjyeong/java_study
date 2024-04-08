package Ex_0318.연습문제;

import java.util.Scanner;

public class ch2_Ex08_switch {
    public static void main(String[] args) {
        //22017100 한지형
        System.out.print("커피를 주문하세요>>");
        Scanner sc = new Scanner(System.in);
        String coffee = sc.next();
        int num= sc.nextInt();

        switch (coffee){

            case "에스프레소":
                System.out.println(2000*num+"원 입니다.");
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
