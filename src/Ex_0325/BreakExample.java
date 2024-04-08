package Ex_0325;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료됩니다");

        while (true){
            System.out.print(">>");
            String txt = sc.next();

            if(txt.equals("exit")) break;
        }
        System.out.println("종료합니다....");
        sc.close();
    }
}
