package Ex_0325.연습문제;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.print("정수 10개를 입력하세요>>");

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]%3 !=0 ) continue;

            System.out.print(arr[i]+" ");
        }

    }
}
