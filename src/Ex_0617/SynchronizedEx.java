package Ex_0617;

public class SynchronizedEx {
    public static void main(String[] args) {

        SharedPrinter p = new SharedPrinter(); // 공유 데이터 생성
        String[] engText = {"wise men say", "hihihi", "hello"};
        String[] korText = {"안녕하세요", "감사해요", "잘 있어요"};

        Thread th1 = new WorkerThread(p, engText); // 영문 출력 쓰레드
        Thread th2 = new WorkerThread(p, korText); // 국문 출력 쓰레드

        // 두 쓰레드 실행시킨다
        th1.start();
        th2.start();
    }
}

class SharedPrinter{ // 두 workerThread에 의해  동시에 접근되는 공유 프린터
  synchronized void print(String text[]){
      for(int i=0;i< text.length;i++){
          for(int j=0;j<text[i].length();j++){
              System.out.print(text[i].charAt(j));
          }
          System.out.println();
      }
  }
}

class WorkerThread extends Thread{
    SharedPrinter p; // 공유기 프린터 주소
    String [] text; // 출력하고자 하는 배열

    WorkerThread(SharedPrinter p, String []text){
        this.p=p; this.text=text;
    }

    @Override
    public  void run(){p.print(text);}

}
