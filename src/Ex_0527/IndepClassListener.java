package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {

    IndepClassListener() {
        setTitle("독립적인 이벤트 리스너");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 버튼 객체 생성하기
        JButton btn = new JButton("Action");

        // 이벤트가 일어날 버튼에 액션 리스너 등록하기
        MyActionListener listener= new MyActionListener(); // 이벤트 리스너 객체 생성
        btn.addActionListener(listener);

        // 컨텐트 팬에 버튼 부착하기
        cp.add(btn);


        setVisible(true);
    }
    public static void main(String[] args) {
        new IndepClassListener();
    }
}


// 독립된 클래스로 이벤트 리스너 작성
// 버튼을 눌렀을때 발생하는 이벤트 이므로 ActionListener 상속받기
    class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // 버튼 액션이 발생했을때 호출되는 함수
        JButton b = (JButton) e.getSource(); //이벤트 객체 정보 가져오기
        if(b.getText().equals("Action")){ // Action 문자열의 버튼을 눌렀을 경우
            b.setText("액션");  // 액션 버튼으로 바꾸기
        }
        else{
            b.setText("Action"); // 반대의 경우 Action으로 바꾸기
        }
    }
}



