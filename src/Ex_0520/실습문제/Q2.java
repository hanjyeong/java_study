package Ex_0520.실습문제;

import Ex_0520.BorderLayoutEx;
import Ex_0520.Myframe;

import javax.swing.*;
import java.awt.*;

public class Q2  extends JFrame {

    Q2(){

        setTitle("[한지형] BorderLayOut 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,200);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout(5,5)); // 배치관리자

        cp.add(new JButton("NORTH"),BorderLayout.NORTH);
        cp.add(new JButton("SOUTH"),BorderLayout.SOUTH);
        cp.add(new JButton("CENTER"),BorderLayout.CENTER);
        cp.add(new JButton("WEST"),BorderLayout.WEST);

        this.setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new Q2();
    }

}