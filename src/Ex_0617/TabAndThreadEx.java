package Ex_0617;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TabAndThreadEx extends JFrame {
    MyLabel bar = new MyLabel(100);

    TabAndThreadEx() {
        setTitle("아무키나 눌러서 바 채우기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 200);

        Container cp = getContentPane();
        cp.setLayout(null);

        // bar 생성
        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setLocation(20, 50);
        bar.setSize(300, 20);

        // 컨턴트 팬에 부착
        cp.add(bar);

        // 키 입력 이벤트 처리
        cp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                bar.fill();
            }
        });

        cp.setFocusable(true);
        cp.requestFocus();

        ConsumerThread th = new ConsumerThread(bar);
        th.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new TabAndThreadEx();
    }
}

class MyLabel extends JLabel {
    int maxBarSize;
    int barSize = 0;

    MyLabel(int maxBarSize) {
        this.maxBarSize = maxBarSize;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);

        int width = (int) (((double) this.getWidth()) / maxBarSize * barSize);

        if (width == 0) return;
        g.fillRect(0, 0, width, this.getHeight());
    }

    synchronized void fill() {
        if (barSize == maxBarSize) {
            try{wait();} catch (InterruptedException e){return;}
        }
        barSize++;
        repaint();
        notify(); // 바 다시 그리기


    }

    synchronized void consume() {
        if (barSize == 0) {
            try{wait();} catch (InterruptedException e){return;}
        }
        barSize--;
        repaint();
        notify(); // 바 다시 그리기
    }
}

class ConsumerThread extends Thread {
    MyLabel bar;

    ConsumerThread(MyLabel bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                bar.consume();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
