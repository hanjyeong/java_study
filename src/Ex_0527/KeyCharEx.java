package Ex_0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyCharEx extends JFrame {

    // key Adapter에서 사용할 수 있도록 public class 멤버로 선언
    JLabel la = new JLabel("<Enter> 키를 누르면 배경색이 바뀝니다");
    Container cp = getContentPane();

    KeyCharEx(){
        setTitle("키 이벤트 리스너 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);

        cp.setLayout(new FlowLayout());
        cp.add(la); // 컨턴트 팬에 라벨 부착

        cp.addKeyListener(new MyKey());// 컨턴트 팬에 키 어댑터 등록하기

        setVisible(true);


        // 컨텐트 팬에 포커스 설정하기 (컨턴트 팬이 키 입력을 독점할 수 있도록)
        cp.setFocusable(true);
        cp.requestFocus();



    }

    // 키 리스너 클래스 내부  클래스로 작성하기
    class MyKey extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) { // KeyEvent e 키 이벤트 객체
         // 키 입력을 받았을때

            // 임의의 색을 만들기 위해 랜덤하게 rgb 성분을 생성
            int r = (int) (Math.random() * 256);// red 성분
            int g = (int) (Math.random() * 256);// green 성분
            int b = (int) (Math.random() * 256);// blue 성분

            // 입력된 키 값 구분하기
            switch (e.getKeyChar()){
                case '\n':
                    cp.setBackground(new Color(r,g,b)); // 배경색 설정
                    la.setText("r= "+r+", g= "+g+", b="+b); // rgb값 화면에 출력
                    break;
                case 'q':
                    System.exit(0); // 프로그램 종료
            }
        }

    }

    public static void main(String[] args) {
        new KeyCharEx();
    }
}
