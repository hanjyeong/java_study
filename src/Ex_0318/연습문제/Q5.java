package Ex_0318.연습문제;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        System.out.print("논리 연산을 입력하세요>>");
        boolean a = sc.nextBoolean();
        String op = sc.next(); // 논리 연산자
        boolean b = sc.nextBoolean();

        //switch
       /* switch (op){
            case "AND":
                result=a&&b;
                break;
            case "OR":
                result=a||b;
                break;
        }
        System.out.println(result);
    }*/

        //if
        if (op.equals("AND")) {
            result = a && b;
        } else {
            result = a || b;
        }
        System.out.println(result);
    }
}
