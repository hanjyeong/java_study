package Ex_0408;

class Book{
    String title;
    String author;

    public void print(){
        System.out.println("제목:"+title+" 저자:"+author);
    }
    public Book(String t){
        title=t;
        author = "작자 미상";
    }

    public Book(String t, String a){
        title=t; author=a;
    }
}

public class BookTest {
    public static void main(String[] args) {

        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");

        System.out.println("littlePrince.title = "+littlePrince.title);
        System.out.println("loveStory.title = "+loveStory.title);

        littlePrince.print();
        loveStory.print();

    }
}
