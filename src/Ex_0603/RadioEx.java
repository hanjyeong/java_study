package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioEx extends JFrame {
    ButtonGroup group = new ButtonGroup(); // 버튼 그룹 생성
    JRadioButton[] rb = new JRadioButton[3]; // 버튼 배열 생성
    String str[] = {"사과", "배", "체리"};

    JLabel la = new JLabel("선택한 과일: ");

    RadioEx(){
        setTitle("[한지형] 라디오 버튼");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(235, 150);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 버튼에 문자열 넣어서, 버튼 그룹에 추가하고 컨텐트 팬에 부착하기, Item리스너 등록하기
        MyItem myItem = new MyItem();
        for(int i=0;i<rb.length;i++){
            rb[i] = new JRadioButton(str[i]); // 라디오 버튼에 문자열 추가하기
            group.add(rb[i]); // 라디오 버튼을 버튼 그룹에 추가하기
            cp.add(rb[i]);    // 라디오 버튼 컨텐트 팬에 부착하기

            rb[i].addItemListener(myItem); // Item 리스너 등록하기
        }

        // la 컨텐트 팬에 부착하기
        cp.add(la);

        setVisible(true);  // Make the frame visible
    }

    class MyItem implements ItemListener{
        // 라디오 버튼이 눌렸을때 이벤트를 처리하는 부분
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getItem()==rb[0]){ // 사과가 선택된 경우
                la.setText("선택된 과일은 사과 입니다");
            }
            else if(e.getItem()==rb[1]){
                // 배가 선택된 경우
                la.setText("선택된 과일은 배 입니다");
            }
            else {
                // 체리가 선택된 경우
                la.setText("선택된 과일은 체리 입니다");
            }
        }
    }
    public static void main(String[] args) {
        new RadioEx();
    }

    }



