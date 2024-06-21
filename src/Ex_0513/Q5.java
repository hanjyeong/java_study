package Ex_0513;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {

        HashMap<String, Integer> nations = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("나라 이름과 인구를 5개 입력하세요.(예:Korea 5000)");

        // 해시맵에 입력 받아 저장
        for(int i=0;i<5;i++){
            System.out.print("나라 이름,인구>>");
            nations.put(sc.next(), sc.nextInt());

        }

        String max_key=""; int max=-1;
        for (String key : nations.keySet()) {
            if(nations.get(key)> max){
                max_key=key;
                max = nations.get(max_key);
            }
        }
        System.out.println("제일 인구가 많은 나라는 ("+max_key+","+nations.get(max_key)+")");

    }
}
