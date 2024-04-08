package Ex_0325;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {

        System.out.print("단 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

        sc.close();
    }
}
