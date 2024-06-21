package Ex_0325;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5]; // 배열 선언
        System.out.print("정수 5개를 입력하세요>>");

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; //임의로 최댓값 설정
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("가장 큰 수는 "+max+"입니다");

        sc.close();
    }
}
