package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    BorderLayoutEx(){

        setTitle("[한지형] BorderLayOut 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,200);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout(30,20)); // 배치관리자

        cp.add(new JButton("calculate"),BorderLayout.CENTER);
        cp.add(new JButton("add"),BorderLayout.NORTH);
        cp.add(new JButton("sub"),BorderLayout.SOUTH);
        cp.add(new JButton("mul"),BorderLayout.EAST);
        cp.add(new JButton("div"),BorderLayout.WEST);

        this.setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }

}
