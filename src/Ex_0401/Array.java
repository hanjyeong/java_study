package Ex_0401;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("행 번호를 입력하세요>>");
        int row = sc.nextInt();
        System.out.print("열 번호를 입력하세요>>");
        int column= sc.nextInt();

        int arr[][] = new int[row][column]; //2차원 배열 생성

        //배열 초기화
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i<2) {arr[i][j] = (int) (Math.random() * 10 + 1);}
                else{arr[i][j]=i;}
            }
        }

        int total=0; //총 합

        //배열 출력하기
        System.out.print("배열\t");
        for(int i=0;i<column;i++) {System.out.print(i+"\t");} // 열 번호 출력
        System.out.print("행합\n");

        for(int i=0;i<row;i++){

            System.out.print(i+"\t\t"); // 행 번호 출력
            int r_sum=0; //행의 합

            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+"\t");
                r_sum+=arr[i][j];
            }
            total+=r_sum; // 총 합 구하기
            System.out.print(r_sum+"\n"); //행의 합 출력
        }

        System.out.print("열합\t");

        for(int i=0;i<column;i++){
            int c_sum=0;
            for(int j=0;j<row;j++){
                c_sum+=arr[j][i];
            }
            System.out.print(c_sum+"\t"); //열의 합 출력
        }

        System.out.print(total+"\n");


    }
}
