package Ex_0325;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.print("정수 5개를 입력하세요>>");

        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("평균은 " + sum / arr.length);

        sc.close();
    }

}
