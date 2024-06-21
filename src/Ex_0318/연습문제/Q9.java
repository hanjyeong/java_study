package Ex_0318.연습문제;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int count=0; // 박수횟수
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99사이의 정수를 입력하세요>>");
        int a= sc.nextInt()/10; //십의 자리
        int b= sc.nextInt()%10; //일의 자리


        if(a==3||a==6||a==9) count++;
        if(b==3||b==6||b==9) count++;

        switch (count){
            case 0:
                System.out.println("박수없음"); break;
            case 1:
                System.out.println("박수짝"); break;
            case 2:
                System.out.println("박수짝짝"); break;
        }



    }
}
