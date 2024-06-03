package Ex_0520.실습문제;

import Ex_0520.CPEx;

import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame {

    Q3(){
        setTitle("[한지형] ContemtPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(200,100);


        Container cp = getContentPane();
        cp.setLayout(new FlowLayout()); // 배치관리자

        // 라벨 생성
        JLabel la = new JLabel("100+200");
        JLabel la2 = new JLabel("300");

        //컨턴트 팬에 부착하기
        cp.add(la);
        cp.add(new JButton("="));
        cp.add(la2);



        this.setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new Q3();
    }
}