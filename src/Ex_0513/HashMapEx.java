package Ex_0513;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, String> dic = new HashMap<>();
        //hashmap 에 값 추가
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");
        // 모든 key를 set컬렉션에 받아옴 -> 중복 허용X
        Set<String> keys = dic.keySet();
        //set에 접근하는 iterator
        Iterator<String> it = keys.iterator();
        // 해쉬맵의 내용 출력
        while (it.hasNext()) {
            String key = it.next(); // 키
            String value = dic.get(key); // 값
            System.out.print("(" + key + "," + value + ")"+" ");
        }
        System.out.println();


        // key 로 value 검색
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = sc.next(); // key값 입력


            if (eng.equals("exit")) break; // 없으면 종료

            String kor = dic.get(eng); // 해시맵에서 키 eng의 값 kor 검색
            if (kor == null) {
                System.out.println(eng + "라는 단어는 없음");
            } else {
                System.out.println(kor);
            }

        }
        System.out.println("===프로그램 종료===");

    }
}
