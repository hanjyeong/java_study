package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {

    JTextField tf = new JTextField(20); // 이름 입력받는 부분
    JTextArea ta = new JTextArea(7, 20); // 입력 받은 이름을 보여주는 부분

    TextAreaEx(){
        setTitle("[한지형] 텍스트 영역 예제 만들기");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 컴포넌트를 컨텐트 팬에 부착하기
        cp.add(new JLabel("입력 후 <enter>를 입력하세요"));
        cp.add(tf); // textFiled 부착
        cp.add(new JScrollPane(ta)); // 스크롤바 객체를 생성해서 TextArea 부착하기

        // textFiled 에 Action 리스너 부착하기
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // tf 부분에 엔터키를 입력했을때 호출될 부분
                ta.append(tf.getText()+"\n");// ta에 tf의 이름 저장하기
                tf.setText(""); // tf 부분 초기화
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx();
    }
}
