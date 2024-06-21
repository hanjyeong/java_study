package Ex_0603.실습문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Q3 extends JFrame {

    ButtonGroup g = new ButtonGroup(); // 버튼 그룹 생성
    JRadioButton[] rb = new JRadioButton[2]; // 버튼 배열 생성
    Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기
    String str[] = {"Red","Blue"};

    Q3() {
        setTitle("[한지형] Two Radio Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300, 100);

        setLayout(new FlowLayout());
        MyItem lin = new MyItem();

        for(int i=0;i<rb.length;i++){
            rb[i] = new JRadioButton(str[i]);
            g.add(rb[i]);  // 라디오 버튼을 버튼 그룹에 넣기
            cp.add(rb[i]); // 컨텐트 팬에 버튼 삽입하기
            rb[i].addItemListener(lin);
        }

        setVisible(true);
    }

    class MyItem implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e){
            if(e.getStateChange() == ItemEvent.SELECTED) {
                if(e.getSource() == rb[0]){ //red 를 선택한 경우
                    cp.setBackground(Color.RED);
                }
                else if(e.getSource() == rb[1]){ // blue를 선택한 경우
                    cp.setBackground(Color.BLUE);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Q3();
    }
}
