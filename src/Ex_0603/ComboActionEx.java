package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
    String[] fruits = {"apple", "banana", "mango"};  // 레이블 배열
    ImageIcon[] images = {new ImageIcon("images/apple.jpg")
                         ,new ImageIcon("images/banana.jpg")
                         ,new ImageIcon("images/mango.jpg")};   // 이미지 배열

    JLabel imageLabel = new JLabel(images[0]);
    JComboBox<String> combo = new JComboBox<>(fruits); // 레이블 배열 값으로 콤보 박스 생성하기

    ComboActionEx(){
        setTitle("[한지형] 콤보박스 활용 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(combo);
        cp.add(imageLabel);
        combo.addActionListener(new ActionListener() {
            // 콤보 박스에서 아이템을 선택하는 경우, 선택된 아이템 이미지를 출력
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = combo.getSelectedIndex(); // 선택된 아이템의 인덱스 번호
                imageLabel.setIcon(images[index]);  // 선택된 아이템 인덱스 번호에 따라 아이템 이미지 출력
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
