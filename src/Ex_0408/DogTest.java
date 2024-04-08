package Ex_0408;
//한지형
class Dog{
    String bread; //종
    int age; //나이
    String color; //색상

    public void print(){
        System.out.println("종: "+bread+", 나이: "+age+", 색상: "+color);
    }
    public void barking(){
        System.out.println(bread+"가 멍멍 짖는다");
    }
    public void eat(String food){
        System.out.println(bread+"가 "+food+"를 먹는다");
    }

    public Dog(){
        bread = "푸들"; age=1;color = "믹스";
    }
    public Dog(String bread,int age,String color){
        this.bread=bread;
        this.age=age;
        this.color=color;
    }
}
public class DogTest {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.print();
        Dog d2 = new Dog("요크셔", 2, "갈색");
        d2.eat("개껌");
        d2.barking();


    }
}
