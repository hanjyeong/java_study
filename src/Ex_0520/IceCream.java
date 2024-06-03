package Ex_0520;

import java.util.*;

public class IceCream {
    public static void main(String[] args) {

        HashMap<String, Integer> maps = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int total=0; //가격의 합

        System.out.println("[실행결과]");
        System.out.println("아이스크림 이름과 가격을 입력하세요");

        // 해시맵에 입력 받아 저장
        for(int i=0;i<3;i++){
            System.out.print("이름,가격>>");
            maps.put(sc.next(), sc.nextInt());
        }
        // keySet()
        System.out.print("아이스크림 이름: ");
        for (String key : maps.keySet()) {
            System.out.print(key+" ");

        }

        System.out.print("\n가격: ");
       // maps.values() value 값만 추출
        for (Integer i : maps.values()) {
            System.out.print(i+" ");
            total+=i; // 총합 계산하기
        }

        System.out.println("\n아이스크림 총 가격: "+total);

        // 방법2)
        // Iterator를 사용하면 key값을 출력할때 value의 값을 배열(Vector)에 저장한다
        // 이후 for문으로 배열 출력
        Set<String> keys = maps.keySet();
        Iterator<String> it= keys.iterator();

        Vector<Integer> price = new Vector<>(); // 가격을 저장할 배열

        System.out.print("아이스크림 이름: ");
        while (it.hasNext()){
            String key=it.next();
            System.out.print(key+" ");
            price.add(maps.get(key));
        }

        System.out.print("\n가격: ");
        for(int i=0;i<price.size();i++){
            System.out.print(price.get(i)+" ");
            total+=price.get(i);
        }

        System.out.println("\n아이스크림 총 가격 = "+total);




    }
        }


