package Ex_0617;
import java.awt.*;
import javax.swing.*;

public class Question2 extends JFrame {
    public Question2() {

        this.setTitle("[한지형] 원을 0.5초 간격으로 이동");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());

        // 컨텐트 팬을 설정하기
        this.setContentPane(new MyPanel());



        this.setSize(300, 300);

        this.setVisible(true);
    }

    // 그래픽 관련된 처리는 JPannel을 이용
   class MyPanel extends JPanel implements Runnable{

        MyPanel(){
            // 생성자에 스레드 시작처리
            // 스레드 생성하고 실행하기
            Thread t = new Thread(this);
            t.start();
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 위치 설정
            int x = (int)(Math.random()*(getWidth()-50));
            int y = (int)(Math.random()*(getHeight()-50));

            // 색 설정하기
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }

        @Override
        public void run() {
            while(true) {
                getParent().repaint();
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }



    public static void main(String[] args) {
        new Question2();
    }
}
