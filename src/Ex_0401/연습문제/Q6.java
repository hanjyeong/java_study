package Ex_0401.연습문제;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while(true){
            boolean isNotExsit=true;

            System.out.print("영어 단어를 입력하세요>>");
            String str = sc.nextLine(); // 영어단어 입력
            if(str.equals("exit")){break;}

            for(int i=0;i< eng.length;i++){
                if(str.equals(eng[i])){
                    isNotExsit=false;
                    System.out.println(kor[i]);
                }
            }
            if(isNotExsit){
                System.out.println("그런 영어 단어가 없습니다");
            }
        }
    }
}
