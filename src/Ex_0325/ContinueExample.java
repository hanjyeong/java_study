package Ex_0325;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 5개 입력하세요:");
        int sum=0;

        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n<=0) continue;  // 음수인 경우 다음 반복문으로 진행
            sum+=n;
        }

        System.out.println("양수의 합은 = "+sum);

        sc.close();


    }
}
