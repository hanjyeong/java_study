package Ex_0415;

class Circle22{

    int radius;
    public static final double PI=3.14;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Circle22(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
}

class Pizza extends Circle22{

    private String topping;

    public Pizza(String topping, int radius){
        super(radius); // super
        this.topping=topping;
    }

    public void print(){
        System.out.println("토핑:" +topping);
        System.out.println("피자 반지름:" +this.getRadius());
        System.out.println("피자 크기:" +this.getArea());
    }

}
public class PizzaTest {
    public static void main(String[] args) {

        Pizza p = new Pizza("파인애플",5);
        p.print();

    }
}
