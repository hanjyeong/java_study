package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class CPEx extends JFrame {

    CPEx(){
        setTitle("[한지형] ContemtPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,150);


        Container cp = getContentPane();
        cp.setBackground(Color.ORANGE); // 오렌지 배경색
        cp.setLayout(new FlowLayout(FlowLayout.LEFT,10,20)); // 배치관리자

        cp.add(new JButton("OK"));
        cp.add(new JButton("CANCLE"));
        cp.add(new JButton("IGNORE"));
        cp.add(new JButton("A"));
        cp.add(new JButton("B"));

        this.setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new CPEx();
    }
}

