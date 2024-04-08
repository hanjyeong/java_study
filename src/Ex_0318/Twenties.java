package Ex_0318;

import java.util.Scanner;

public class Twenties {

    public static void main(String[] args) {

        System.out.print("나이를 입력하시오:");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=20 && age<30){
            System.out.print("20대 입니다. ");
            System.out.println("20대라서 행복합니다!");
        }
        else{
            System.out.println("20대가 아닙니다");
        }

        sc.close();
    }
}
