package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener2 extends JFrame {

    IndepClassListener2(){
        setTitle("익명 클래스로 ActionListener 작성");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 버튼 생성
        JButton btn = new JButton("Action");

        // 익명 클래스로 버튼에 이벤트 리스너 클래스 작성하면서 동시에 객체 생성하기
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 이벤트 발생시 처리될 부분 작성
                JButton b= (JButton) e.getSource();
                if(b.getText().equals("Action")){
                    b.setText("액션");
                }
                else{
                    b.setText("Action");
                }
            }
        });


        // 버튼을 컨텐트 팬에 부착하기
        cp.add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener2();
    }
}


