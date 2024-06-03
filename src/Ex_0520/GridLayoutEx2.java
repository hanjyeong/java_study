package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx2 extends JFrame {

    GridLayoutEx2() {
        setTitle("GridLayout 예제 ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(500, 200);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기

        cp.setLayout(new GridLayout(2,5,5,5));

        // 10개의 버튼 부착
        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            cp.add(button);
        }

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new GridLayoutEx2();
    }
}