package Ex_0318;

import java.util.Scanner;

public class NesteIf {

    public static void main(String[] args) {

        System.out.print("점수를 입력하세요:");

        Scanner sc = new Scanner(System.in);
        int score= sc.nextInt();

        System.out.print("학년을 입력하세요(1~4):");
        int year = sc.nextInt();

        // 4학년은 70점 이상일때 합격
        if(score>=60){

            if(year!=4){
                System.out.println("합격!");
            }
            else if(score>=70){
                System.out.println("합격!");
            }
            else{
                System.out.println("불합격!");  //4학년이 70점 미만
            }

        }
        else{
            System.out.println("불합격!");     // 60점 미만
        }

        sc.close();
    }
}
