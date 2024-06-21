package Ex_0415;

class Rect{

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
    }

    public Rect(){
        width=1;height=1;
    }
    public Rect(int width,int height){
        this.width=width;
        this.height=height;
    }
}

class Vol extends Rect{

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
        //super(); 어차피 슈퍼클래스 기본 생성자 호출
        depth=1;
    }
    public Vol(int width,int height,int depth){
        super(width, height);
        this.depth=depth;
    }


}
public class RectTest { // 한지형
    public static void main(String[] args) {
        Rect r = new Rect();
        Vol  v = new Vol(2, 2, 2 );

        System.out.println("가로: "+r.getWidth()+", 높이: "+r.getHeight());
        System.out.println("깊이: "+v.getDepth()+", 부피: "+v.volume());
    }

}
