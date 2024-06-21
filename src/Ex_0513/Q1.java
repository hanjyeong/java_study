package Ex_0513;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int max=0;

        System.out.print("정수 5개 입력>>");
        for(int i=0;i<5;i++){ // arr.size() 는 값이 있는 크기를 리턴 vs capacity 차이
            arr.add(sc.nextInt());
            // 최댓값 구하기
            if(arr.get(i) > arr.get(max)){
                max=i;
            }
        }
        System.out.println("가장 큰 수는 "+arr.get(max));
    }
}
