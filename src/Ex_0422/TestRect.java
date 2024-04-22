package Ex_0422;


class Rect22{

    private int width; //가로
    private int height; //세로

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return width*height;
    }
    public int around(){
        return  (width+height)*2;
    } // 사각형 둘레 계산

    public Rect22(){
        width=1;height=1;
    }
    public Rect22(int width,int height){
        this.width=width;
        this.height=height;
    }
}

class Vol extends Rect22 { //서브 클래스

    private int depth; //깊이
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int volume(){
        return area()*depth;  // 부피를 계산하는 함수
    }

    public Vol(){
        super(); depth=1; // 슈퍼 클래스의 생성자 호출로 초기화
    }
    public Vol(int width,int height,int depth){
        super(width, height); // 슈퍼 클래스의 생성자 호출로 초기화
        this.depth=depth;
    }
    @Override
    public int around() {
        return (super.around()) * 2 + depth * 4; // 부모의 around를 호출하기 위해 super.around()
    }
}

public class TestRect {
    public static void main(String[] args) { //한지형
        Rect22 r = new Rect22();
        Vol v = new Vol(2, 2, 2 );

        System.out.println("가로: "+r.getWidth()+", 높이: "+r.getHeight());
        System.out.println("깊이: "+v.getDepth()+", 부피: "+v.volume());
        System.out.println("사각형의 둘레: "+r.around()+", 직육면체둘레: "+v.around());

    }
}
