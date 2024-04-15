package Ex_0415.연습문제;

import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    public Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }
    public String getName(){return name;}
    public String getTel(){return tel;}
}
public class PhoneManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = sc.nextInt();
        Phone[] arr = new Phone[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            arr[i] = new Phone(sc.next(), sc.next()); // 입력받은 값으로 배열 초기화
        }
        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름>>");
            String findName = sc.next();

            if (findName.equals("exit")) { //exit입력시 종료 
                break;
            }
            int i;
            for (i = 0; i < arr.length; i++) { // 이름을 배열에서 검색하기
               if (findName.equals(arr[i].getName())) {
                    System.out.println(arr[i].getName() + "의 번호는" + arr[i].getTel() + " 입니다");
                    break;
                }
            }
            // 끝까지 못찾은 경우 i값은 arr.length가 된다.
            if(i== arr.length) System.out.println(findName+"이 없습니다");
        }


    }
}