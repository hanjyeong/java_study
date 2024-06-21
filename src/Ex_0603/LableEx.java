package Ex_0603;

import Ex_0520.Myframe;

import javax.swing.*;
import java.awt.*;

public class LableEx extends JFrame {

    LableEx(){
        setTitle("[한지형] 레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,500);


        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기
        cp.setLayout(new FlowLayout());

        // JLabel 이용해서 문자열과 이미지 출력하기
        JLabel textLabel = new JLabel("제임스 고슬링 입니다!!");

        ImageIcon img = new ImageIcon("images/gosling.jpg"); // 사진 첨부
        JLabel imageLable = new JLabel(img);

        ImageIcon icon = new ImageIcon("images/icon.gif");
        JLabel imagelabel2 = new JLabel("커피 한잔 하실레예. 전화주이소", icon, SwingConstants.CENTER);

        // 컴포넌트 요소 컨텐트팬에 부착하기
        cp.add(textLabel);
        cp.add(imageLable);
        cp.add(imagelabel2);

        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {

        new LableEx();
    }
}