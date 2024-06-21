package Ex_0520.실습문제;

import Ex_0520.BorderLayoutEx;
import Ex_0520.Myframe;

import javax.swing.*;
import java.awt.*;

public class Q2  extends JFrame {

    Q2(){
        setTitle("Borderlayout 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);

        //컨텐트팬 알아내기
        Container cp = getContentPane();
        // 배치 관리자 생성하기
        cp.setLayout(new BorderLayout(5,5));

        // 영역에 따라서 버튼 생성하기
        cp.add(new Button("north"), BorderLayout.NORTH);
        cp.add(new Button("west"), BorderLayout.WEST);
        cp.add(new Button("center"), BorderLayout.CENTER);
        cp.add(new Button("south"), BorderLayout.SOUTH);


        setVisible(true);

    }
    public static void main(String[] args) {
        new Q2();
    }

}