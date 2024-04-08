package Ex_0325;

import java.util.Scanner;

public class GuguFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n 을 입력하세요>>");
        int n= sc.nextInt();
        int sum=0;  // 합계

        for(int i=0;i<=n;i++){
            sum+=i;
        }

        System.out.println("1~"+n+"까지의 합 = "+ sum);
        sc.close();
    }
}
