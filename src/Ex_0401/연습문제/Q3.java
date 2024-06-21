package Ex_0401.연습문제;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("정수를 입력하세요>>");
            int n;

            try {
                n= sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("수를 입력하지않아 프로그램을 종료합니다");
                break;
            }

            if(n%2==0){
                System.out.println("짝수");
            }
            else{
                System.out.println("홀수");
            }
        }
    }
}
