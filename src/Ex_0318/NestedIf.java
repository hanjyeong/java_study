package Ex_0318;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요>>");
        int score=sc.nextInt();
        System.out.print("학년을 입력하세요>>");
        int grade=sc.nextInt();

        if(score>=60){
            if(grade!=4){
                System.out.println("합격입니다");
            }
            else if(score>=70){
                System.out.println("합격입니다");
            }
            else {
                System.out.println("불합격 입니다");
            }
        }
        else{
            System.out.println("불합격 입니다");
        }
    }
}
