package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame {

    JLabel la = new JLabel("hello"); // 내부 클래스들에서 사용할 수 있도록

    MouseListenerEx(){
        setTitle("마우스 리스너 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        Container cp = getContentPane();
        cp.setLayout(null); // 배치 관리자 없애기

        // 라벨 설정하기
        la.setSize(50,20); // 라벨의 크기
        la.setLocation(30,30); // 라벨의 위치

        // 컨텐트 팬에 이벤트 리스너 등록하기
        cp.addMouseListener(new MyMouse());


        // 라벨을 컨텐트 팬에 부착하기
        cp.add(la);

        setVisible(true);
    }

    class MyMouse implements MouseListener{

        @Override
        public void mousePressed(MouseEvent e) {
            int x=e.getX(); // 마우스의 x 좌표
            int y =e.getY(); // 마우스의 y 좌표
            la.setLocation(x, y);
        }
        @Override
        public void mouseClicked(MouseEvent e) {}


        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }

}


