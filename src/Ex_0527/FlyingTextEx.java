package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlyingTextEx extends JFrame {

    JLabel la = new JLabel("Hello");
    Container cp = getContentPane();

    FlyingTextEx(){

        setTitle("상하좌우 키로 문자열 움직이기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(null); // 배치 관리자 없애기
        setVisible(true);

        // 라벨 설정
        la.setSize(100,20);
        la.setLocation(50,50);
        cp.add(la);

        // 컨텐트 팬에 key Adapter 등록하기
        cp.addKeyListener(new MyKeyListener());

        // 컨텐트 팬에 포커스 설정하기
        cp.setFocusable(true);
        cp.requestFocus();

    }

    class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int keycode = e.getKeyCode();

            // 가상 키 입력과 비교하기
            switch (keycode){
                case KeyEvent.VK_UP : // UP키
                    la.setLocation(la.getX(), la.getY()-10); break;
                case KeyEvent.VK_DOWN : // DOWN키
                    la.setLocation(la.getX(), la.getY()+10); break;
                case KeyEvent.VK_LEFT: //LEFT키
                    la.setLocation(la.getX()-10, la.getY());  break;
                case KeyEvent.VK_RIGHT: // RIGHT키
                    la.setLocation(la.getX()+10, la.getY()); break;

            }

        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
