package Ex_0610;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicBackTest extends JFrame {

    JTextField tf =new JTextField(10); // 글쓰는곳 만들기
    JButton btn = new JButton("출력"); // 버튼
    GraphicBackTest(){
        setTitle("한지형");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setContentPane(new MyPanel()); // 배경 이미지를 세팅하기 위해

        Container cp = getContentPane();
        cp.add(tf);
        cp.add(btn);

        tf.addActionListener(new MyAction());
        btn.addActionListener(new MyAction());

        setVisible(true);
    }

    //배경화면 설정
    class MyPanel extends JPanel{
        ImageIcon icon = new ImageIcon("images/img2.jpg");
        Image img= icon.getImage(); // 배경 이미지 선택하기
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    class MyAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s= tf.getText().toString();
            JOptionPane.showMessageDialog(null,"입력한 내용:"+s,"내용 확인",JOptionPane.INFORMATION_MESSAGE);
            tf.setText("");
            tf.requestFocus();
        }
    }

    public static void main(String[] args) {
        new GraphicBackTest();
    }
}
