package Ex_0318.연습문제;

import java.util.Scanner;

public class Q8_if {

    public static void main(String[] args) {
        //22017100 한지형
        System.out.print("커피를 주문하세요>>");
        Scanner sc = new Scanner(System.in);
        String coffee = sc.next();
        int num= sc.nextInt();

        // 문자열 비교 equals
          if(coffee.equals("에스프레소")){
              System.out.println(2000*num+"원 입니다.");
          }
          else if(coffee.equals("아메리카노")){
              System.out.println(2500*num+"원 입니다.");
          }
          else if(coffee.equals("카푸치노")){
              System.out.println(3000*num+"원 입니다.");
          }
          else if(coffee.equals("카페라떼")){
              System.out.println(3500*num+"원 입니다.");
          }

    }
}
