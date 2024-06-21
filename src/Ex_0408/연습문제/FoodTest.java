package Ex_0408.연습문제;

import java.util.Scanner;

class Food{
    private String name;
    private int kcal;

    public Food(){
        name = "김치";kcal=10;
    }

    public Food(String name,int kcal){
        this.name=name;
        this.kcal=kcal;
    }

    public int cal(int count){
        return kcal*count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}

public class FoodTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name; int kcal;

        Food[] arr = new Food[2];

        for(int i=0;i<arr.length;i++){
            System.out.print("음식정보 입력(이름,칼로리)>>");
            arr[i] = new Food(sc.next(), sc.nextInt());
        }

        System.out.println("==음식 정보 목록==");
        for(int i=0;i< arr.length;i++){
            System.out.println("음식명: "+arr[i].getName()+" 칼로리: "+arr[i].getKcal());
        }

        System.out.print("음식명>>"); name=sc.next();
        System.out.print("주문개수>>"); int count= sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i].getName().equals(name)){
                System.out.println("총 칼로리: "+arr[i].cal(count));
            }
        }


    }
}
