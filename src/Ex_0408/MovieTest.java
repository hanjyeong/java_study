package Ex_0408;

class Movie{
    String title; //제목
    double score; //평점
    int year; //발표년도

    public void print(){
        System.out.printf("제목:%s\t평점:%.1f\t발표년도:%4d\n",title,score,year);
    }
    public Movie(String title,double score,int year){
        this.title=title;
        this.score=score;
        this.year=year;
    }
    public Movie(){
        title = "알라딘"; score=4.5; year=2019;
    }

}
public class MovieTest {
    public static void main(String[] args) {

        Movie m1=new Movie();
        Movie m2 = new Movie("공조", 4.3, 2023);
        m1.print();
        m2.print();
        m2.year=2024;
        m2.print();
    }


}
