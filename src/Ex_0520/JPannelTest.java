package Ex_0520;

import javax.swing.*;
import java.awt.*;

public class JPannelTest extends JFrame {

    // 이벤트 처리에 사용되는 것은 필드로 설정
    JButton[] btns = new JButton[3];
    String[] strs = {"0:가위", "1:바위", "2:보"};
    JLabel laResult = new JLabel("인간:컴퓨터");

    JPannelTest(){
        setTitle("[한지형] Pannel 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,200);
        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기

        cp.add(new JLabel("아래의 버튼중 하나를 클릭하시오"),BorderLayout.NORTH);
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,3));
        for(int i=0;i<3;i++){
            btns[i]=new JButton(strs[i]);
            p1.add(btns[i]);
        }
        cp.add(p1); // 패널 더하기

        JPanel p2= new JPanel();
        p2.setBackground(Color.WHITE);
        p2.add(laResult);

        cp.add(p2,BorderLayout.SOUTH);


        this.setVisible(true); // 컴포넌트 표시
    }

    public static void main(String[] args) {
        new JPannelTest();
    }
}
