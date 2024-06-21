package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame {
    OptionPaneEx(){
        setTitle("[한지형] 옵션 팬 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200);

        Container cp = getContentPane();
        cp.add(new MyPanel(), BorderLayout.NORTH);

        setVisible(true);
    }

    class MyPanel extends JPanel{
        String[] names = {"Input Name", "Confirm", "Message"};
        JButton[] btns = new JButton[3];
        JTextField tf = new JTextField(10);

        MyPanel(){
            setBackground(Color.GRAY);
            for(int i=0;i<btns.length;i++){
                btns[i] = new JButton(names[i]);
                btns[i].addActionListener(new MyAction());
                this.add(btns[i]);
            }
            this.add(tf);
        }

        class MyAction implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                if(btn == btns[0]){
                    String name = JOptionPane.showInputDialog("이름을 입력하세요");
                    if(name != null) {tf.setText(name);}
                }
                else if(btn == btns[1]){
                    int result = JOptionPane.showConfirmDialog(null, "계속 할 것 입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if(result== JOptionPane.CANCEL_OPTION) tf.setText("Jest Closed without selection");
                    else if(result==JOptionPane.YES_OPTION)  tf.setText("Yes");
                    else {tf.setText("NO");}
                }
                else{
                    JOptionPane.showMessageDialog(null,"조심하세요","Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        new OptionPaneEx();
    }
}
