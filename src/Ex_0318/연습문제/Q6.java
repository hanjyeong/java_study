package Ex_0318.연습문제;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요>>");
        int money= sc.nextInt();

        int m50000= money/50000; money%=50000;
        int m10000= money/10000; money%=10000;
        int m1000 = money/1000;  money%=1000;
        int c500 =  money/500;   money%=500;
        int c100 = money/100;    money%=100;
        int c10 = money/10;      money%=10;
        int c1 = money%10;

        System.out.println("오만원 "+m50000+"개, 만원 "+m10000+"개 , "
                + "천원 "+m1000+"개, 500원 "+c500+"개 , 100원 "+c100+"개, 10원 "
                +c10+"개, 1원 "+ c1+"개 ");
    }
}
