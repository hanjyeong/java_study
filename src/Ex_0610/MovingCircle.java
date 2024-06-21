package Ex_0610;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MovingCircle extends JFrame {

    public MovingCircle() {
        setTitle("Moving Circle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        setContentPane(new MyPanel()); // 컨텐트 팬에 패널 부착하기

        setVisible(true);
    }

    class MyPanel extends JPanel implements Runnable {
        private int x = 100;
        private int y = 100;
        private final int DIAMETER = 50;
        private Thread thread; // 스레드 객체 생성

        public MyPanel() {
            thread = new Thread(this);
            thread.start();
        }

        // 원 그리기
        @Override
        protected void paintComponent(Graphics g) {
            //super.paintComponent(g);
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, DIAMETER, DIAMETER);
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
                x = random.nextInt(getWidth() - DIAMETER);
                y = random.nextInt(getHeight() - DIAMETER);
                getParent().repaint();
            }
        }
    }

    public static void main(String[] args) {
        new MovingCircle();
    }
}
