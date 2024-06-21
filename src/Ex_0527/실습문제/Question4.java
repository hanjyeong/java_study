package Ex_0527.실습문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Question4 extends JFrame {

    JLabel la = new JLabel("Love Java");
    Container cp = getContentPane();


    Question4(){
        setTitle("실습문제 4번");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);

        //컨텐트 팬 설정하기
        cp.setLayout(new FlowLayout());
        cp.add(la);
        cp.addKeyListener(new MyKey()); // 키 이벤트 리스너 등록하기

        // 포커스 설정하기
        cp.setFocusable(true);
        cp.requestFocus();

    }

    // 키 어댑터 클래스 작성하기
    class MyKey extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            // 키를 입력 받았을때
            int keyCode = e.getKeyCode();

            Font f= la.getFont(); // 현재 la의 폰트 종류
            int size= f.getSize(); // 폰트 사이즈

            switch (keyCode){
                case KeyEvent.VK_UP: // up키가 입력된 경우
                    la.setFont(new Font("Arial",Font.BOLD,size+5)); // 현재 폰트 크기 +5
                    break;
                case KeyEvent.VK_DOWN: // down키가 입력된 경우
                    if(size<10){ size=11;} //  최소 6픽셀로 하기
                    la.setFont(new Font("Arial",Font.BOLD,size-5)); // 현재 폰트 크기 -5
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Question4();
    }
}
