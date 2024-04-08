package Ex_0325.연습문제;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {

        System.out.print("알파벳 한 문자를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char c= s.charAt(0);

        for(char i='a';i<=c;i++){
            for(char j=i;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }




    }
}
