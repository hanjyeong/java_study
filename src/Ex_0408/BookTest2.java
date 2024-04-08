package Ex_0408;

class Book2{
    String title;
    String author;

    public void show(){
        System.out.println("제목:"+title+" 저자:"+author);
    }

    public Book2(){
        this("",""); // title=" ", author=" "
        System.out.println("생성자 호출됨 ");
    }
    public Book2(String title){
        this.title=title;
        author = "작자 미상";
    }

    public Book2(String title, String author){
        this.title=title; this.author=author;
    }
}

public class BookTest2 {
    public static void main(String[] args) {

        Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
        Book2 loveStory = new Book2("춘향전");
        Book2 emptyBook = new Book2();

        System.out.println("littlePrince.title = "+littlePrince.title);
        System.out.println("loveStory.title = "+loveStory.title);


    }
}
