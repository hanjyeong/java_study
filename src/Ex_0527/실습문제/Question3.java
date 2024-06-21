package Ex_0527.실습문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Question3 extends JFrame {

    JLabel la = new JLabel("Java_Ex03");
    Container cp = getContentPane();
    Question3(){
        setTitle("실습문제 3번");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);

        // 컨텐트 팬 설정
        cp.setBackground(Color.GREEN); // 배경색 초록색
        cp.add(la);

        // 컨텐트 팬에 마우스 이벤트 등록하기
        cp.addMouseMotionListener(new MyMouse()); // 마우스 모션 리스너 등록
        cp.addMouseListener(new MyMouse()); // 마우스 리스너 등록 !! 주의 하기 둘다 등록해줘야함 !!

        setVisible(true);
    }

    class MyMouse extends MouseAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            // 마우스가 드래그 되는 동안 호출되는 부분
            cp.setBackground(Color.YELLOW); // 마우스가 드래그 되는 동안 배경색을 노란색으로 설정
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // 마우스를 놓았을때 다시 원래의 배경색으로 설정하기
            cp.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Question3();
    }
}
