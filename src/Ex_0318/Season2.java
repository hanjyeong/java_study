package Ex_0318;

import java.util.Scanner;

public class Season2{

    public static void main(String[] args) {

        System.out.println("봄/여름/가을/겨울 중에 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        String season = sc.next();
        char c = season.charAt(0); // 문자열에서 문자 추출


        switch (season){

            case "봄":
                System.out.println("3~5월 입니다");
                break;
            case "여름":
                System.out.println("3~5월 입니다");
                break;
            case "가을":
                System.out.println("3~5월 입니다");
                break;
            case "겨울":
                System.out.println("3~5월 입니다");
                break;

            default:
                System.out.println("잘못된 입력입니다");
        }
        switch (c){

            case '봄':
                System.out.println("3~5월 입니다");
                break;
            case '여':
                System.out.println("3~5월 입니다");
                break;
            case '가':
                System.out.println("3~5월 입니다");
                break;
            case '겨':
                System.out.println("3~5월 입니다");
                break;

            default:
                System.out.println("잘못된 입력입니다");
        }
        sc.close();
    }

}

