package Ex_0520.실습문제;

import Ex_0520.CPEx;

import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame {

    Q3(){
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        // 컨텐트 팬 알아내기
        Container cp = getContentPane();
        // 배치 관리자 설정하기
        cp.setLayout(new FlowLayout());

        // 컨텐트 팬에 요소들 생성하고 붙이기
        cp.add(new JLabel("100+200"));
        cp.add(new JButton("="));
        cp.add(new JLabel("300"));



        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3();
    }
}