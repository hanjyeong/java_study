package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {

    NullContainerEx(){
        setTitle("[한지형] 배치관리자 없는 Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,200);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기
        cp.setLayout(null); // 배치관리자 없음

        // 라벨 생성
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200,20);
        cp.add(la); // la를 컨텐트 팬에 부착

        // 버튼 생성
        for(int i=0;i<9;i++){
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            cp.add(b); // 버튼을 컨텐트 팬에 부착
        }

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
