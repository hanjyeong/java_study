package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {

    Myframe(){
        setTitle("[한지형] 첫번째 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,300);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new Myframe();
    }
}
