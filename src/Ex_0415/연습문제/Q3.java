package Ex_0415.연습문제;


import java.util.Scanner;

class Rect{

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rect(int width, int height){
        this.width=width;
        this.height=height;

    }
    public int getArea(){return width*height;}
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total=0; //사각형의 넓이 합

        Rect[] arr = new Rect[4]; //4개의 Rect 객체 배열
        for(int i=0;i<4;i++){
            System.out.print((i+1)+" 너비와 높이 >>");
            arr[i] = new Rect(sc.nextInt(), sc.nextInt()); // 객체 배열을 입력받은 값으로 초기화
            total+=arr[i].getArea(); // 넓이의 합 저장하기
        }
        System.out.println("저장하였습니다.");
        System.out.println("사각형의 전체 합은 "+total);
    }
}
