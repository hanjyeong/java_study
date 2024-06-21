package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventAllEx extends JFrame {

    JLabel la = new JLabel("  Move me");
    Container cp = getContentPane();

    MouseEventAllEx(){
        setTitle("마우스 이벤트 7가지 메서드 전부 처리해보기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(null); // 배치 관리자 없애기
        setVisible(true);

        la.setSize(50,20); // 라벨의 크기
        la.setLocation(30,30); // 라벨의 위치

        cp.add(la);

        // 컨텐트 팬에 마우스 리스너 등록하기
        cp.addMouseListener(new MyMouse()); // 마우스 리스너 등록
        cp.addMouseMotionListener(new MyMouse()); // 마우스 모션 리스너 등록
    }

    // MouseListener와 MouseMotionListener 모두를 가진 리스너 구현
    class MyMouse extends MouseAdapter {

        // MouseListener
        @Override
        public void mouseClicked(MouseEvent e) {
            // 마우스로 컴포넌트를 클릭했을때
        }

        @Override
        public void mousePressed(MouseEvent e) {
         // 마우스를 누를때
            // 누른 마우스의 위치로 라벨 움직이기
            int x=e.getX(); // 마우스로 누른 x 좌표
            int y=e.getY(); // 마우스로 누른 y 좌표
            la.setLocation(x,y);

            setTitle("mousePressed (" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        // 컴포넌트를 눌렀다가 뗄 때
            // 마우스를 뗀 지점으로 라벨 움직이기
            int x=e.getX();
            int y=e.getY();
            la.setLocation(x,y);
            setTitle("mouseReleased (" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
         // 마우스가 컴포넌트 위에 올라갈때
            cp.setBackground(Color.cyan); // 배경색을 cyan으로 설정하기
            setTitle("mouseEntered (" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseExited(MouseEvent e) {
         // 마우스가 컴포넌트 위에서 내려올때
            cp.setBackground(Color.yellow);
            setTitle("mouseExited (" + e.getX() + "," + e.getY() + ")");
        }

        // MouseMotionListener
        @Override
        public void mouseDragged(MouseEvent e) { // 마우스가 드래깅 되는 동안 계속 호출
            int x=e.getX();
            int y=e.getY();
            la.setLocation(x,y);
            setTitle("mouseDragged (" + e.getX() + "," + e.getY() + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) { // 마우스가 움직이는 동안 계속 호출
            int x=e.getX();
            int y=e.getY();
            la.setLocation(x,y);
            setTitle("mouseMoved (" + e.getX() + "," + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new MouseEventAllEx();
    }


}
