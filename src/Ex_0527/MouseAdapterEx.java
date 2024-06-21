package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseAdapterEx extends JFrame {

    JLabel la = new JLabel("hello"); // 내부 클래스들에서 사용할 수 있도록

    MouseAdapterEx(){
        setTitle("마우스 리스너 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        Container cp = getContentPane();
        // 컨텐트 팬에 이벤트 리스너 등록하기
        cp.addMouseListener(new MyMouseAdapter());


        cp.setLayout(null); // 배치 관리자 없애기
        la.setSize(50,20); // 라벨의 크기
        la.setLocation(30,30); // 라벨의 위치


        // 라벨을 컨텐트 팬에 부착하기
        cp.add(la);

        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter { // 마우스 리스너 대신 마우스 어댑터 클래스 상속 받기
        public void mousePressed(MouseEvent e) {
            int x=e.getX(); // 마우스의 x 좌표
            int y =e.getY(); // 마우스의 y 좌표
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }

}


