package Ex_0325;

import java.util.Scanner;

public class whileTest02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int com = (int)(Math.random() * 10) +1; //random()= 0.0~9.9
        int count=0;  // 횟수

        while(true){

            System.out.print("컴퓨터가 생각한 수를 맞춰보세요(1~10사이)>>");
            int n = sc.nextInt();
            count++;

            if(com==n){
                System.out.println(count+"번 만에 맞췄습니다!!");
                break;
            }
            else if(com>n){
                System.out.println("입력한 수가 더 작습니다");
            }
            else{
                System.out.println("입력한 수가 더 큽니다");
            }


        }
        sc.close();
    }
}
