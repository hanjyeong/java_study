package Ex_0520.실습문제;

import Ex_0520.NullContainerEx;

import javax.swing.*;
import java.awt.*;

public class Q6 extends JFrame {

    Q6(){
        setTitle("[한지형] 배치관리자 없는 Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,300);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기
        cp.setLayout(null); // 배치관리자 없음


        for(int i=0;i<20;i++){
            JLabel la = new JLabel(Integer.toString(i));
            // 위치 설정
            int x = (int) (Math.random() * (this.getWidth() - 50));
            int y = (int) (Math.random() * (this.getHeight() - 50));
            la.setLocation(x,y);

            la.setSize(20,20);
            la.setForeground(Color.MAGENTA);
            cp.add(la); // la를 컨텐트 팬에 부착
        }

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new Q6();
    }
}
