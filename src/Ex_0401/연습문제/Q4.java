package Ex_0401.연습문제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day[] = {"일", "월", "화", "수", "목", "금", "토"};

        while(true){
            System.out.print("정수를 입력하세요>>");

            try{

                int n=sc.nextInt();
                if(n==-1){
                    System.out.println("프로그램을 종료합니다...");
                    break;
                }
                else{
                    System.out.println(day[n%7]);
                }


            }catch (InputMismatchException e){
                System.out.println("경고! 수를 입력하지 않았습니다.");
                sc.next(); // 버퍼에 있는 값 버리기
            }

        }

    }

}
