
package Ex_0603.실습문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxButtonControl extends JFrame {
    JCheckBox disableButtonCheckBox;
    JCheckBox hideButtonCheckBox;
    JButton testButton;

    public CheckBoxButtonControl() {
        setTitle("CheckBox와 Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new FlowLayout());

        disableButtonCheckBox = new JCheckBox("버튼 비활성화");
        hideButtonCheckBox = new JCheckBox("버튼 감추기");
        testButton = new JButton("test button");

        disableButtonCheckBox.addItemListener(new CheckBoxHandler());
        hideButtonCheckBox.addItemListener(new CheckBoxHandler());

        add(disableButtonCheckBox);
        add(hideButtonCheckBox);
        add(testButton);

        setVisible(true);
    }

    class CheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == disableButtonCheckBox) {
                testButton.setEnabled(!disableButtonCheckBox.isSelected());
            }
            if (e.getSource() == hideButtonCheckBox) {
                testButton.setVisible(!hideButtonCheckBox.isSelected());
            }
        }
    }

    public static void main(String[] args) {
        new CheckBoxButtonControl();
    }
}
