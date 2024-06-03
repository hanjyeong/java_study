package Ex_0520.실습문제;

import Ex_0520.GridLayoutEx1;

import javax.swing.*;
import java.awt.*;

public class Q5 extends JFrame {


    Q5() {
        setTitle("[한지형] GridLayout 예제 ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(500, 200);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기

        Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY};

       // 4x4 설정
        cp.setLayout(new GridLayout(4, 4));

        // 16개의 버튼 부착
        for (int i = 0; i < 16; i++) {
            JLabel la = new JLabel(Integer.toString(i));
            la.setOpaque(true); // 불투명 설정
            la.setBackground(color[i%10]);
            cp.add(la);
        }

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new Q5();
    }
}